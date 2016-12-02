package com.dismas.imaya.menudrawer.ui.navigationdrawer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

import com.dismas.imaya.menudrawer.R;
import com.dismas.imaya.menudrawer.data.model.NavigationDrawerItem;
import com.dismas.imaya.menudrawer.ui.misc.BetterViewAnimator;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by imaya on 12/2/16.
 */

public class NavigationDrawerView extends BetterViewAnimator {

    @InjectView(R.id.leftDrawerListView)
    ListView leftDrawerListView;

    private final NavigationDrawerAdapter adapter;


    public NavigationDrawerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        adapter = new NavigationDrawerAdapter(context);
    }

    public void replaceWith(List<NavigationDrawerItem> items) {
        adapter.replaceWith(items);
        setDisplayedChildId(R.id.leftDrawerListView);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.inject(this);
        leftDrawerListView.setAdapter(adapter);
    }

    public NavigationDrawerAdapter getAdapter() {
        return adapter;
    }
}