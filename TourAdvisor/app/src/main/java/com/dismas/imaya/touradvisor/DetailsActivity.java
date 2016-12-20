package com.dismas.imaya.touradvisor;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.uber.sdk.android.core.utils.Preconditions.checkNotNull;
import static com.uber.sdk.android.core.utils.Preconditions.checkState;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener, RideRequestButtonCallback {
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

    ArrayList<ParksAllConstructor> alldetails = new ArrayList<>();

    private ProgressDialog loading;
    Context context;
    private ImageView mImageView, mImageView1, mImageView2;
    private TextView mTitle, phone, email, titletxt;

    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private ViewFlipper mViewFlipper;
    private Context mContext;
    private final GestureDetector detector = new GestureDetector(new SwipeGestureDetector());

    RatingBar ratingbar1;
    Button button, showinmap;
    ImageButton imageButton, imageButton1;
    String value;
    String longitude;
    String latitude;
    String restaurant_name;
    String cost_per_day;
    String phone_no;
    String email_add;
    String location_name;
    String hotel_image,interior_image, guest_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        mContext = this;
        mViewFlipper = (ViewFlipper) this.findViewById(R.id.view_flipper);
        mViewFlipper.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
                detector.onTouchEvent(event);
                return true;
            }
        });
//        final List<ParksAllConstructor> rowListItem = getAllDetails();
        Bundle bundle = getIntent().getExtras();

        value = bundle.getString("position");
        longitude = bundle.getString("longitude");
        latitude = bundle.getString("latitude");
        restaurant_name = bundle.getString("restaurant_name");
        cost_per_day = bundle.getString("cost_per_day");
        phone_no = bundle.getString("phone");
        email_add = bundle.getString("email");
        location_name = bundle.getString("location_name");
        hotel_image = bundle.getString("hotel_image");
        interior_image = bundle.getString("interior_image");
        guest_image = bundle.getString("guest_image");

        configuration = new SessionConfiguration.Builder()
                .setRedirectUri(REDIRECT_URI)
                .setClientId(CLIENT_ID)
                .setServerToken(SERVER_TOKEN)
                .build();

        validateConfiguration(configuration);
        final ServerTokenSession session = new ServerTokenSession(configuration);

        mImageView = (ImageView) findViewById(R.id.placeImage);
        mImageView1 = (ImageView) findViewById(R.id.placeImage1);
        mImageView2 = (ImageView) findViewById(R.id.placeImage2);
        mTitle = (TextView) findViewById(R.id.detailstextView);
        titletxt = (TextView) findViewById(R.id.titletxt);
        phone = (TextView) findViewById(R.id.phone);
        email = (TextView) findViewById(R.id.email);

        DROPOFF_ADDR = restaurant_name;//restaurant name
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
        titletxt.setText(restaurant_name);
        mTitle.setText(cost_per_day);
        if(phone_no.isEmpty())
        {
            phone.setText("N/A");
        }
        else
        {
            phone.setText(phone_no);
        }
        if(email_add.isEmpty())
        {
            email.setText("N/A");
        }
        else
        {
            email.setText(email_add);
        }
        Picasso.with(context)
                .load(hotel_image)
                .placeholder(R.drawable.error)
                .into(mImageView);
        if(!interior_image.isEmpty()){
            Picasso.with(context)
                    .load(interior_image)
                    .placeholder(R.drawable.error)
                    .into(mImageView1);
        }
        else {
            Picasso.with(context)
                    .load(R.drawable.error)
                    .placeholder(R.drawable.error)
                    .into(mImageView1);
        }
        if(!guest_image.isEmpty())
        {
            Picasso.with(context)
                    .load(guest_image)
                    .placeholder(R.drawable.error)
                    .into(mImageView2);
        }
        else {
            Picasso.with(context)
                    .load(R.drawable.error)
                    .placeholder(R.drawable.error)
                    .into(mImageView2);
        }

        addListenerOnButtonClick();
        addListenerOnButtonShare();
        addListenerOnButton1Click();
        addListenerOnButtonBack();
    }
    class SwipeGestureDetector extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            try {
                // right to left swipe
                if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.left_in));
                    mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext, R.anim.left_out));
                    mViewFlipper.showNext();
                    return true;
                } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.right_in));
                    mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext,R.anim.right_out));
                    mViewFlipper.showPrevious();
                    return true;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return false;
        }
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
                    Intent intent = new Intent(DetailsActivity.this, ShowinmapFragment.class);
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

    public void addListenerOnButtonClick(){
        ratingbar1=(RatingBar)findViewById(R.id.ratingBar1);
        button=(Button)findViewById(R.id.ratebtn);
        //Performing action on Button Click
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                String rating=String.valueOf(ratingbar1.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }

        });

    }
    public void addListenerOnButtonShare(){
        imageButton=(ImageButton) findViewById(R.id.btn_share);

        //Performing action on Button Click
        imageButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // Get access to the URI for the bitmap
                mImageView = (ImageView) findViewById(R.id.placeImage);
                Uri bmpUri = getLocalBitmapUri(mImageView);
                // Construct a ShareIntent with link to image
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("*/*");
                shareIntent.putExtra(Intent.EXTRA_STREAM, bmpUri);
                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Awesome Accommodation");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Check "+restaurant_name+" out on TourAdvisor\nTheir cost per day ranges " + cost_per_day+ "\n" +phone_no+ "\n" + email_add);
                // Launch sharing dialog for image
                startActivity(Intent.createChooser(shareIntent, "Share"));
            }

        });

    }
    // Returns the URI path to the Bitmap displayed in specified ImageView
    public Uri getLocalBitmapUri(ImageView imageView) {
        // Extract Bitmap from ImageView drawable
        Drawable drawable = imageView.getDrawable();
        Bitmap bmp = null;
        if (drawable instanceof BitmapDrawable){
            bmp = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        } else {
            return null;
        }
        // Store image to default external storage directory
        Uri bmpUri = null;
        try {
            File file =  new File(Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_DOWNLOADS), restaurant_name.toLowerCase() + System.currentTimeMillis() + ".png");
            file.getParentFile().mkdirs();
            FileOutputStream out = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.PNG, 90, out);
            out.close();
            bmpUri = Uri.fromFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bmpUri;
    }
    public void addListenerOnButtonBack(){
        imageButton1 =(ImageButton) findViewById(R.id.btn_back);

        //Performing action on Button Click
        imageButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                if (getFragmentManager().getBackStackEntryCount() > 0) {
                    getFragmentManager().popBackStack();
                } else {
                    finish();

                }

            }

        });

    }

    @Override
    public void onClick(View v) {

    }

    private List<ParksAllConstructor> getAllDetails() {

        loading = ProgressDialog.show(this, "Please wait...", "Fetching details...", false, false);

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
                        Toast.makeText(DetailsActivity.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

        return alldetails;
    }

    private void showJSON(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray("accommodations");


            for (int i = 0; i < result.length(); i++) {

                JSONObject detailsData = result.getJSONObject(i);
                ParksAllConstructor details = new ParksAllConstructor();
                //park.setAttraction_site_id(detailsData.getInt("attraction_site_id"));
                details.setSite_name(detailsData.getString("restaurant_name"));
                details.setLocation_name(detailsData.getString("location_name"));
                details.setSite_image(detailsData.getString("hotel_image"));
                details.setCost_per_day(detailsData.getString("cost_per_day"));
                details.setPhone(detailsData.getString("phone"));
                details.setEmail(detailsData.getString("email"));
                details.setLongitude(detailsData.getString("longitude"));
                details.setLatitude(detailsData.getString("latitude"));
                alldetails.add(details);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
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
                Toast.makeText(DetailsActivity.this, "Auth error " + error.name(), Toast.LENGTH_SHORT).show();
                Log.d(ERROR_LOG_TAG, "Error occurred during authentication: " + error.toString
                        ().toLowerCase());
            } else if (data.getSerializableExtra(RideRequestActivity.RIDE_REQUEST_ERROR) != null) {
                RideRequestViewError error = (RideRequestViewError) data.getSerializableExtra(RideRequestActivity
                        .RIDE_REQUEST_ERROR);
                Toast.makeText(DetailsActivity.this, "RideRequest error " + error.name(), Toast.LENGTH_SHORT).show();
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.accommodation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}
