package com.dismas.imaya.touradvisor;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.dismas.imaya.touradvisor.configs.MapAllConfig;
import com.dismas.imaya.touradvisor.constructors.ParksAllConstructor;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imaya on 12/15/16.
 */
public class DetailsFragment extends Fragment implements View.OnClickListener{
    ArrayList<ParksAllConstructor> alldetails = new ArrayList<>();

    private ProgressDialog loading;
    Context context;
    private ImageView mImageView;
    private TextView mTitle;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View x =  inflater.inflate(R.layout.fragment_details,container, false);
        //Retrieve the value
        final String value = getArguments().getString("position");
        mImageView = (ImageView) x.findViewById(R.id.placeImage);
        mTitle = (TextView) x.findViewById(R.id.textView) ;
        final List<ParksAllConstructor> rowListItem = getAllDetails();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                mTitle.setText(rowListItem.get(Integer.parseInt(value)).getSite_name());
                Picasso.with(context)
                        .load(rowListItem.get(Integer.parseInt(value)).getSite_image())
                        .placeholder(R.drawable.error)
                        .into(mImageView);
            }
        }, 3000);
        // Inflate the layout for this fragment
        return x;
    }

    private List<ParksAllConstructor> getAllDetails() {

        loading = ProgressDialog.show(getActivity(), "Please wait...", "Fetching details...", false, false);

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
                        Toast.makeText(getActivity(), error.getMessage().toString(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
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
                alldetails.add(details);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {

    }
}
