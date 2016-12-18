package com.dismas.imaya.touradvisor;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.dismas.imaya.touradvisor.adapters.RecyclerViewAdapter;
import com.dismas.imaya.touradvisor.configs.ParkAllConfig;
import com.dismas.imaya.touradvisor.constructors.ParksAllConstructor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imaya on 12/2/16.
 */
public class ParkFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{

    private LinearLayoutManager lLayout;

    SwipeRefreshLayout mSwipeRefreshLayout;

    ArrayList<ParksAllConstructor> parks = new ArrayList<>();

    private ProgressDialog loading;



    Handler mHandler = new Handler();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        View x =  inflater.inflate(R.layout.fragment_park,container, false);
        ((MainActivityDrawer) getActivity()).topToolBar.setTitle("My list");

        lLayout = new LinearLayoutManager(getActivity());

        final RecyclerView rView = (RecyclerView) x.findViewById(R.id.recycler_view);
        List<ParksAllConstructor> rowListItem = getAllPark();
        final RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getActivity(), rowListItem);
        rView.setLayoutManager(lLayout);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                rView.setAdapter(rcAdapter);
            }
        }, 2000);


        Toast.makeText(getActivity(), "Swipe down to refresh", Toast.LENGTH_LONG).show();
        mSwipeRefreshLayout = (SwipeRefreshLayout) x.findViewById(R.id.swipe_container);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorSchemeResources(
                android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);


        // Inflate the layout for this fragment
        return x;
    }



    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser) {
            // Set title
            getActivity().getActionBar()
                    .setTitle("My list");
        }
    }

    @Override
    public void onRefresh() {

    }
    public List<ParksAllConstructor> getAllPark(){
        loading = ProgressDialog.show(getActivity(), "Please wait...", "Fetching National Parks...", false, false);

        String url = ParkAllConfig.DATA_URL;

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loading.dismiss();
                showJSON(response);
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

        return parks;
    }

    private void showJSON(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray("parks");


            for (int i = 0; i < result.length(); i++) {

                JSONObject parkData = result.getJSONObject(i);
                ParksAllConstructor park = new ParksAllConstructor();
                //park.setAttraction_site_id(parkData.getInt("attraction_site_id"));
                park.setSite_name(parkData.getString("site_name"));
                park.setLocation_name(parkData.getString("location_name"));
                park.setSite_image(parkData.getString("site_image"));
                parks.add(park);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
