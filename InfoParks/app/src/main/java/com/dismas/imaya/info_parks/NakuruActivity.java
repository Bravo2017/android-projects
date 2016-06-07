package com.dismas.imaya.info_parks;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by imaya on 6/8/16.
 */
public class NakuruActivity extends Activity implements View.OnClickListener {

    public static final String EXTRA_PARAM_ID = "place_id";
    private ImageView mImageView;
    private ListView mList;
    private TextView mTitle;
    private LinearLayout mTitleHolder;
    private RelativeLayout mRevealView;
    private Place mPlace;

    int defaultColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nakurudetail);

        mPlace = PlaceData.placeList().get(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));

        mList = (ListView) findViewById(R.id.list);
        mImageView = (ImageView) findViewById(R.id.placeImage);
        mTitle = (TextView) findViewById(R.id.textView);
        mTitleHolder = (LinearLayout) findViewById(R.id.placeNameHolder);

        mRevealView = (RelativeLayout) findViewById(R.id.TextHolder);


        defaultColor = getResources().getColor(R.color.primary_dark);

        mRevealView.setVisibility(View.VISIBLE);
        loadPlace();
        windowTransition();
        getPhoto();

    }

    private void loadPlace() {
        mTitle.setText(mPlace.name);
        mImageView.setImageResource(mPlace.getImageResourceId(this));
    }

    private void windowTransition() {

    }

    private void getPhoto() {
        Bitmap photo = BitmapFactory.decodeResource(getResources(), mPlace.getImageResourceId(this));
        colorize(photo);
    }

    private void colorize(Bitmap photo) {
        Palette mPalette = Palette.generate(photo);
        applyPalette(mPalette);
    }

    private void applyPalette(Palette mPalette) {
        getWindow().setBackgroundDrawable(new ColorDrawable(mPalette.getDarkMutedColor(defaultColor)));
        mTitleHolder.setBackgroundColor(mPalette.getMutedColor(defaultColor));

    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}