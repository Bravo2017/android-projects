package com.dismas.imaya.touradvisor;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
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
 * Created by imaya on 12/17/16.
 */

public class AllAttractionsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{

    private LinearLayoutManager lLayout;

    SwipeRefreshLayout mSwipeRefreshLayout;

    ArrayList<ParksAllConstructor> attractions = new ArrayList<>();

    private ProgressDialog loading;
    RecyclerViewAdapter rcAdapter;


    Handler mHandler = new Handler();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View x =  inflater.inflate(R.layout.fragment_allattractions,container, false);
        ((MainActivityDrawer) getActivity()).topToolBar.setTitle("Attraction Sites");

        lLayout = new LinearLayoutManager(getActivity());

        final RecyclerView rView = (RecyclerView) x.findViewById(R.id.recycler_view_all);
        rView.setItemAnimator(new DefaultItemAnimator());
        rView.setLayoutManager(lLayout);
        final List<ParksAllConstructor> rowListItem = getAllPark();
        rcAdapter = new RecyclerViewAdapter(getActivity(), rowListItem);

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

        RecyclerViewAdapter.OnItemClickListener onItemClickListener = new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
//                Toast.makeText(getActivity(), "Clicked " + position, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(), AttractionDetailActivity.class);
                //Create the bundle
                getFragmentManager().beginTransaction().addToBackStack(null);
                Bundle bundle = new Bundle();
                bundle.putString("position", String.valueOf(position));
                bundle.putString("longitude", rowListItem.get(position).getLongitude());
                bundle.putString("latitude", rowListItem.get(position).getLatitude());
                bundle.putString("site_name", rowListItem.get(position).getSite_name());
                bundle.putString("site_image", rowListItem.get(position).getSite_image());
                bundle.putString("interior_image", rowListItem.get(position).getInterior_image());
                bundle.putString("attractions_image", rowListItem.get(position).getAttraction_image());
                bundle.putString("location_name", rowListItem.get(position).getLocationName());
                bundle.putString("opening_hrs", rowListItem.get(position).getOpeninghrs());
                bundle.putString("categories", rowListItem.get(position).getCategories());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        };

        rcAdapter.setOnItemClickListener(onItemClickListener);

        // Inflate the layout for this fragment
        return x;
    }



    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser) {
            // Set title
            getActivity().getActionBar()
                    .setTitle("Attraction Sites");
        }
    }

    @Override
    public void onRefresh() {

    }
    public List<ParksAllConstructor> getAllPark(){
        loading = ProgressDialog.show(getActivity(), "Please wait...", "Fetching all atttractions...", false, false);

        String url = ParkAllConfig.ALLATTRACTIONS_URL;

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

        return attractions;
    }

    private void showJSON(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray("attractions");


            for (int i = 0; i < result.length(); i++) {

                JSONObject attractionData = result.getJSONObject(i);
                ParksAllConstructor attraction = new ParksAllConstructor();
                //park.setAttraction_site_id(parkData.getInt("attraction_site_id"));
                attraction.setSite_name(attractionData.getString("site_name"));
                attraction.setLocation_name(attractionData.getString("location_name"));
                attraction.setSite_image(attractionData.getString("site_image"));
                attraction.setLatitude(attractionData.getString("latitude"));
                attraction.setLongitude(attractionData.getString("longitude"));
                attraction.setInterior_image(attractionData.getString("interior_image"));
                attraction.setAttraction_image(attractionData.getString("attractions_image"));
                attraction.setOpeninghrs(attractionData.getString("opening_hrs"));
                attraction.setCategories(attractionData.getString("categories"));
                attractions.add(attraction);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}