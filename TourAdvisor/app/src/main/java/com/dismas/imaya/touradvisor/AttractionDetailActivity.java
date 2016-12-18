package com.dismas.imaya.touradvisor;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.dismas.imaya.touradvisor.adapters.Horizontal_RecyclerViewAdapter;
import com.dismas.imaya.touradvisor.configs.MapAllConfig;
import com.dismas.imaya.touradvisor.constructors.ParksAllConstructor;
import com.squareup.picasso.Picasso;
import com.uber.sdk.android.core.auth.AuthenticationError;
import com.uber.sdk.android.rides.RideParameters;
import com.uber.sdk.android.rides.RideRequestActivity;
import com.uber.sdk.android.rides.RideRequestButton;
import com.uber.sdk.android.rides.RideRequestButtonCallback;
import com.uber.sdk.android.rides.RideRequestViewError;
import com.uber.sdk.rides.client.ServerTokenSession;
import com.uber.sdk.rides.client.SessionConfiguration;
import com.uber.sdk.rides.client.error.ApiError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static com.uber.sdk.android.core.utils.Preconditions.checkNotNull;
import static com.uber.sdk.android.core.utils.Preconditions.checkState;

/**
 * Created by imaya on 12/17/16.
 */
public class AttractionDetailActivity extends AppCompatActivity implements View.OnClickListener, RideRequestButtonCallback {
    ////////
    String DROPOFF_ADDR;
    Double DROPOFF_LAT;
    Double DROPOFF_LONG;
    String DROPOFF_NICK;
    private String ERROR_LOG_TAG = "UberSDK-MainActivity";
    private static final String PICKUP_ADDR = "Prof David Wasawo Dr.";
    private static final Double PICKUP_LAT = -1.2724939;
    private static final Double PICKUP_LONG = 36.8067234;
    private static final String PICKUP_NICK = "Science and Physics Labs";
    private static final String UBERX_PRODUCT_ID = "a1111c8c-c720-46c3-8534-2fcdd730040d";
    private static final int WIDGET_REQUEST_CODE = 1234;

    private static final String CLIENT_ID = BuildConfig.CLIENT_ID;
    private static final String REDIRECT_URI = BuildConfig.REDIRECT_URI;
    private static final String SERVER_TOKEN = BuildConfig.SERVER_TOKEN;

    private SessionConfiguration configuration;
    ////////
    Context context;
    private ImageView mImageView;
    private TextView mTitle, categories_hrs, titletxt, accommo_title;

    Button showinmap;
    String value;
    String longitude;
    String latitude;
    String site_name;
    String site_image;
    String interior_image;
    String attractions_image;
    String location_name;
    String opening_hrs,categories;

    private LinearLayoutManager lLayout;

    ArrayList<ParksAllConstructor> accommodations = new ArrayList<>();

    private ProgressDialog loading;
    Horizontal_RecyclerViewAdapter rcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractiondetail);

        lLayout = new LinearLayoutManager(this);
        lLayout.setOrientation(LinearLayoutManager.HORIZONTAL);

        final RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view_accommodations);
        rView.setLayoutManager(lLayout);
        List<ParksAllConstructor> rowListItem = getAllSanctuaries();
        rcAdapter = new Horizontal_RecyclerViewAdapter(this, rowListItem);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                rView.setAdapter(rcAdapter);
            }
        }, 10000);


        Bundle bundle = getIntent().getExtras();

        value = bundle.getString("position");
        longitude = bundle.getString("longitude");
        latitude = bundle.getString("latitude");
        site_name = bundle.getString("site_name");
        site_image = bundle.getString("site_image");
        interior_image = bundle.getString("interior_image");
        attractions_image = bundle.getString("attractions_image");
        location_name = bundle.getString("location_name");
        opening_hrs = bundle.getString("opening_hrs");
        categories = bundle.getString("categories");

        configuration = new SessionConfiguration.Builder()
                .setRedirectUri(REDIRECT_URI)
                .setClientId(CLIENT_ID)
                .setServerToken(SERVER_TOKEN)
                .build();

        validateConfiguration(configuration);
        final ServerTokenSession session = new ServerTokenSession(configuration);

        mImageView = (ImageView) findViewById(R.id.placeImage);
        mTitle = (TextView) findViewById(R.id.detailstextView);
        titletxt = (TextView) findViewById(R.id.titletxt);
        categories_hrs = (TextView) findViewById(R.id.categories_hrs);
        accommo_title = (TextView) findViewById(R.id.accommo_title);

        DROPOFF_ADDR = site_name;//restaurant name
        DROPOFF_LAT = Double.parseDouble(latitude);
        DROPOFF_LONG = Double.parseDouble(longitude);
        DROPOFF_NICK = location_name;

        RideParameters rideParametersForProduct = new RideParameters.Builder()
                .setPickupLocation(PICKUP_LAT, PICKUP_LONG, PICKUP_NICK, PICKUP_ADDR)
                .setDropoffLocation(DROPOFF_LAT, DROPOFF_LONG, DROPOFF_NICK, DROPOFF_ADDR)
                .build();

        RideRequestButton uberButtonWhite = (RideRequestButton) findViewById(R.id.uber_button_white);

        uberButtonWhite.setRideParameters(rideParametersForProduct);
        uberButtonWhite.setSession(session);
        uberButtonWhite.loadRideInformation();
        titletxt.setText(site_name);
        mTitle.setText(location_name);
        accommo_title.setText("Accommodation Near " + location_name);
        categories_hrs.setText("\t "+opening_hrs + "\n " + categories);
        Picasso.with(context)
                .load(site_image)
                .placeholder(R.drawable.error)
                .into(mImageView);

        addListenerOnButton1Click();
    }

    private void addListenerOnButton1Click() {
        showinmap =(Button)findViewById(R.id.showinmap);
        showinmap.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                int off = 0;
                try {
                    off = Settings.Secure.getInt(getContentResolver(), Settings.Secure.LOCATION_MODE);
                } catch (Settings.SettingNotFoundException e) {
                    e.printStackTrace();
                }
                if(off==0){
                    Intent onGPS = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    startActivity(onGPS);
                }
                else {
                    Intent intent = new Intent(AttractionDetailActivity.this, ShowinmapFragment.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("longitude", String.valueOf(DROPOFF_LONG));
                    bundle.putString("latitude", String.valueOf(DROPOFF_LAT));
                    bundle.putString("location_name", String.valueOf(DROPOFF_ADDR));
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

            }

        });
    }

    @Override
    public void onClick(View v) {

    }
    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onRideInformationLoaded() {
        Toast.makeText(this, "Estimates have been refreshed", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onError(ApiError apiError) {
        Toast.makeText(this, apiError.getClientErrors().get(0).getTitle(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onError(Throwable throwable) {
        Log.e("DetailsActivity", "Error obtaining Metadata", throwable);
        Toast.makeText(this, "Connection error", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == WIDGET_REQUEST_CODE && resultCode == Activity.RESULT_CANCELED && data != null) {
            if (data.getSerializableExtra(RideRequestActivity.AUTHENTICATION_ERROR) != null) {
                AuthenticationError error = (AuthenticationError) data.getSerializableExtra(RideRequestActivity
                        .AUTHENTICATION_ERROR);
                Toast.makeText(AttractionDetailActivity.this, "Auth error " + error.name(), Toast.LENGTH_SHORT).show();
                Log.d(ERROR_LOG_TAG, "Error occurred during authentication: " + error.toString
                        ().toLowerCase());
            } else if (data.getSerializableExtra(RideRequestActivity.RIDE_REQUEST_ERROR) != null) {
                RideRequestViewError error = (RideRequestViewError) data.getSerializableExtra(RideRequestActivity
                        .RIDE_REQUEST_ERROR);
                Toast.makeText(AttractionDetailActivity.this, "RideRequest error " + error.name(), Toast.LENGTH_SHORT).show();
                Log.d(ERROR_LOG_TAG, "Error occurred in the Ride Request Widget: " + error.toString().toLowerCase());
            }
        }
    }
    /**
     * Validates the local variables needed by the Uber SDK used in the sample project
     * @param configuration
     */
    private void validateConfiguration(SessionConfiguration configuration) {
        String nullError = "%s must not be null";
        String sampleError = "Please update your %s in the gradle.properties of the project before " +
                "using the Uber SDK Sample app. For a more secure storage location, " +
                "please investigate storing in your user home gradle.properties ";

        checkNotNull(configuration, String.format(nullError, "SessionConfiguration"));
        checkNotNull(configuration.getClientId(), String.format(nullError, "Client ID"));
        checkNotNull(configuration.getRedirectUri(), String.format(nullError, "Redirect URI"));
        checkNotNull(configuration.getServerToken(), String.format(nullError, "Server Token"));
        checkState(!configuration.getClientId().equals("insert_your_client_id_here"),
                String.format(sampleError, "Client ID"));
        checkState(!configuration.getRedirectUri().equals("insert_your_redirect_uri_here"),
                String.format(sampleError, "Redirect URI"));
        checkState(!configuration.getRedirectUri().equals("insert_your_server_token_here"),
                String.format(sampleError, "Server Token"));
    }
    public List<ParksAllConstructor> getAllSanctuaries(){
        loading = ProgressDialog.show(this, "Please wait...", "Fetching Accommodations...", false, false);

        String url = MapAllConfig.DATA_URL;

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                showJSON(response);
                loading.dismiss();
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(AttractionDetailActivity.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

        return accommodations;
    }

    private void showJSON(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray("accommodations");


            for (int i = 0; i < result.length(); i++) {

                JSONObject accommodationData = result.getJSONObject(i);
                ParksAllConstructor accommodation = new ParksAllConstructor();
                //park.setAttraction_site_id(accommodationData.getInt("attraction_site_id"));
                accommodation.setSite_name(accommodationData.getString("restaurant_name"));
                accommodation.setLocation_name(accommodationData.getString("location_name"));
                accommodation.setSite_image(accommodationData.getString("hotel_image"));
                accommodation.setCost_per_day(accommodationData.getString("cost_per_day"));
                accommodation.setPhone(accommodationData.getString("phone"));
                accommodation.setEmail(accommodationData.getString("email"));
                accommodation.setLongitude(accommodationData.getString("longitude"));
                accommodation.setLatitude(accommodationData.getString("latitude"));
                accommodations.add(accommodation);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
