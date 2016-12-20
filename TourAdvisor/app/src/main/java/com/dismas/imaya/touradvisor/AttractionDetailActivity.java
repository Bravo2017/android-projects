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
import android.os.Handler;
import android.provider.Settings;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
    private ImageView mImageView, mImageView1, mImageView2;
    ImageButton imageButton, imageButton1, imageButton2;
    private TextView mTitle, categories_hrs, titletxt, accommo_title;

    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private ViewFlipper mViewFlipper;
    private Context mContext;
    private final GestureDetector detector = new GestureDetector(new SwipeGestureDetector());

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
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<String> ImagesArray = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractiondetail);

        mContext = this;
        mViewFlipper = (ViewFlipper) this.findViewById(R.id.view_flipper);
        mViewFlipper.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
                detector.onTouchEvent(event);
                return true;
            }
        });

        lLayout = new LinearLayoutManager(this);
        lLayout.setOrientation(LinearLayoutManager.HORIZONTAL);

        final RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view_accommodations);
        rView.setLayoutManager(lLayout);
        final List<ParksAllConstructor> rowListItem = getAllSanctuaries();
        rcAdapter = new Horizontal_RecyclerViewAdapter(this, rowListItem);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                rView.setAdapter(rcAdapter);
            }
        }, 3000);


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
        mImageView1 = (ImageView) findViewById(R.id.placeImage1);
        mImageView2 = (ImageView) findViewById(R.id.placeImage2);
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
        if(!interior_image.isEmpty())
        {
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
        if(!attractions_image.isEmpty())
        {
            Picasso.with(context)
                    .load(attractions_image)
                    .placeholder(R.drawable.error)
                    .into(mImageView2);
        }
        else {
            Picasso.with(context)
                    .load(R.drawable.error)
                    .placeholder(R.drawable.error)
                    .into(mImageView2);
        }

//        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(AttractionDetailActivity.this));
//        init();
        addListenerOnButton1Click();
        addListenerOnButtonShare();
        addListenerOnButtonAdd();
        addListenerOnButtonBack();

        Horizontal_RecyclerViewAdapter.OnItemClickListener onItemClickListener = new Horizontal_RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
//                Toast.makeText(getActivity(), "Clicked " + position, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(AttractionDetailActivity.this, DetailsActivity.class);
                //Create the bundle
                getFragmentManager().beginTransaction().addToBackStack(null);
                Bundle bundle = new Bundle();
                bundle.putString("position", String.valueOf(position));
                bundle.putString("longitude", rowListItem.get(position).getLongitude());
                bundle.putString("latitude", rowListItem.get(position).getLatitude());
                bundle.putString("restaurant_name", rowListItem.get(position).getSite_name());
                bundle.putString("cost_per_day", rowListItem.get(position).getCost_per_day());
                bundle.putString("phone", rowListItem.get(position).getPhone());
                bundle.putString("email", rowListItem.get(position).getEmail());
                bundle.putString("location_name", rowListItem.get(position).getLocationName());
                bundle.putString("hotel_image", rowListItem.get(position).getSite_image());
                bundle.putString("interior_image", rowListItem.get(position).getInterior_image());
                bundle.putString("guest_image", rowListItem.get(position).getAttraction_image());
                intent.putExtras(bundle);
                startActivity(intent);


                //Put the value
//                DetailsFragment detailsFragment = new DetailsFragment();
//                Bundle args = new Bundle();
//                args.putString("position", String.valueOf(position));
//                detailsFragment.setArguments(args);
//
//                //Inflate the fragment
//                getFragmentManager().beginTransaction().addToBackStack(null).add(R.id.containerView, detailsFragment).commit();

            }
        };

        rcAdapter.setOnItemClickListener(onItemClickListener);

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
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Check "+site_name+" out on TourAdvisor\nFound in " + location_name+ "\n" +categories+ "\nOpen hours: " + opening_hrs);
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
                    Environment.DIRECTORY_DOWNLOADS), site_name.toLowerCase() + System.currentTimeMillis() + ".png");
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
    public void addListenerOnButtonAdd(){
        imageButton1 =(ImageButton) findViewById(R.id.action_add_to_my_list);

        //Performing action on Button Click
        imageButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                Toast.makeText(AttractionDetailActivity.this, "Add to my list", Toast.LENGTH_LONG).show();

            }

        });

    }
    public void addListenerOnButtonBack(){
        imageButton2 =(ImageButton) findViewById(R.id.btn_back);

        //Performing action on Button Click
        imageButton2.setOnClickListener(new View.OnClickListener(){

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
//    private void init() {
//        ImageLoader imageLoader = ImageLoader.getInstance();
////        Bitmap sitebmp = imageLoader.loadImageSync(site_image);
////        Bitmap interiorbmp = imageLoader.loadImageSync(interior_image);
////        Bitmap attractionsbmp = imageLoader.loadImageSync(attractions_image);
//
//        ImagesArray.add(site_image);
//        ImagesArray.add(interior_image);
//        ImagesArray.add(attractions_image);
//
//        mPager = (ViewPager) findViewById(R.id.pager);
//
//
//        mPager.setAdapter(new SlidingImage_Adapter(AttractionDetailActivity.this, ImagesArray));
//
//
//        CirclePageIndicator indicator = (CirclePageIndicator)
//                findViewById(R.id.indicator);
//
//        indicator.setViewPager(mPager);
//
//        final float density = getResources().getDisplayMetrics().density;
//
////Set circle indicator radius
//        indicator.setRadius(5 * density);
//
//        NUM_PAGES =3;
//
//        // Auto start of viewpager
//        final Handler handler = new Handler();
//        final Runnable Update = new Runnable() {
//            public void run() {
//                if (currentPage == NUM_PAGES) {
//                    currentPage = 0;
//                }
//                mPager.setCurrentItem(currentPage++, true);
//            }
//        };
//        Timer swipeTimer = new Timer();
//        swipeTimer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                handler.post(Update);
//            }
//        }, 3000, 3000);
//
//        // Pager listener over indicator
//        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//
//            @Override
//            public void onPageSelected(int position) {
//                currentPage = position;
//
//            }
//
//            @Override
//            public void onPageScrolled(int pos, float arg1, int arg2) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int pos) {
//
//            }
//        });
//
//    }
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
                accommodation.setInterior_image(accommodationData.getString("interior_image"));
                accommodation.setAttraction_image(accommodationData.getString("guest_image"));
                accommodations.add(accommodation);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.add_to_my_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            Toast.makeText(AttractionDetailActivity.this, "Share", Toast.LENGTH_LONG).show();
            Intent i=new Intent(android.content.Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(android.content.Intent.EXTRA_SUBJECT,"Cool Destination");
            i.putExtra(android.content.Intent.EXTRA_TEXT, "Check it out on TourAdvisor");
            startActivity(Intent.createChooser(i,"Share via"));

        }
        else if (id == R.id.action_add_to_my_list) {
            Toast.makeText(AttractionDetailActivity.this, "Add to My List", Toast.LENGTH_LONG).show();


        }
        return super.onOptionsItemSelected(item);
    }
}
