package com.dismas.imaya.info_parks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by imaya on 6/7/16.
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
                //Toast.makeText(getActivity(), "Clicked " + position, Toast.LENGTH_SHORT).show();

                if(position == 0)
                {
                    Intent intent = new Intent(getActivity(), DetailActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 1)
                {
                    Intent intent = new Intent(getActivity(), AmboseliActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 2)
                {
                    Intent intent = new Intent(getActivity(), ArabukoActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 3)
                {
                    Intent intent = new Intent(getActivity(), BogoriaActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 4)
                {
                    Intent intent = new Intent(getActivity(), BuffaloActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 5)
                {
                    Intent intent = new Intent(getActivity(), HellsActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 6)
                {
                    Intent intent = new Intent(getActivity(), KakamegaActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 7)
                {
                    Intent intent = new Intent(getActivity(), LewaActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 8)
                {
                    Intent intent = new Intent(getActivity(), MaasaiActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 9)
                {
                    Intent intent = new Intent(getActivity(), MarsabitActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 10)
                {
                    Intent intent = new Intent(getActivity(), MeruActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 11)
                {
                    Intent intent = new Intent(getActivity(), MombasaActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 12)
                {
                    Intent intent = new Intent(getActivity(), MtkenyaActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 13)
                {
                    Intent intent = new Intent(getActivity(), MtlongonotActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 14)
                {
                    Intent intent = new Intent(getActivity(), NaivashaActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 15)
                {
                    Intent intent = new Intent(getActivity(), NakuruActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 16)
                {
                    Intent intent = new Intent(getActivity(), SamburuActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 17)
                {
                    Intent intent = new Intent(getActivity(), ShabaActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 18)
                {
                    Intent intent = new Intent(getActivity(), ShimbaActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 19)
                {
                    Intent intent = new Intent(getActivity(), TaitaActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 20)
                {
                    Intent intent = new Intent(getActivity(), TsavoEastActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 21)
                {
                    Intent intent = new Intent(getActivity(), TsavoWestActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 22)
                {
                    Intent intent = new Intent(getActivity(), WatamuActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }

            }
        };
        mAdapter.setOnItemClickListener(onItemClickListener);

        return rootView;
    }
}

