package com.dismas.imaya.info_parks;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * Created by imaya on 5/27/16.
 */
public class GameParksFragment extends Fragment {
    private Menu menu;
    private boolean isListView;
    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    private TravelListAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_gameparksfragment, container, false);

        isListView = true;

        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mStaggeredLayoutManager);

        mAdapter = new TravelListAdapter(getActivity());
        mRecyclerView.setAdapter(mAdapter);

        TravelListAdapter.OnItemClickListener onItemClickListener = new TravelListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Toast.makeText(getActivity(), "Clicked " + position, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                startActivity(intent);
            }
        };
        mAdapter.setOnItemClickListener(onItemClickListener);

        return rootView;
    }
}
