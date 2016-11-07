package com.dismas.imaya.touradvisor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by imaya on 11/6/16.
 */
public class AppIntroFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    @Bind(R.id.relative_layout_fragment_splash)
    RelativeLayout relativeLayoutSplash;
    @Bind(R.id.text_view_splash_title)
    TextView txtSplashTitle;
    @Bind(R.id.text_view_splash_desc)
    TextView txtSplashDesc;
    @Bind(R.id.image_view_splash)
    ImageView imgSplash;
    @Bind(R.id.background)
    ImageView imgBack;
    @Bind(R.id.image_view_empty_dot_1)
    ImageView imgEmptyDot1;
    @Bind(R.id.image_view_empty_dot_2)
    ImageView imgEmptyDot2;
    @Bind(R.id.image_view_empty_dot_3)
    ImageView imgEmptyDot3;
    @Bind(R.id.image_view_empty_dot_4)
    ImageView imgEmptyDot4;
    @Bind(R.id.image_view_selected_dot_1)
    ImageView imgSelectedDot1;
    @Bind(R.id.image_view_selected_dot_2)
    ImageView imgSelectedDot2;
    @Bind(R.id.image_view_selected_dot_3)
    ImageView imgSelectedDot3;
    @Bind(R.id.image_view_selected_dot_4)
    ImageView imgSelectedDot4;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static AppIntroFragment newInstance(int sectionNumber) {
        AppIntroFragment fragment = new AppIntroFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_appintro, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int sectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);
        txtSplashTitle.setText(getString(R.string.section_format, sectionNumber));

        switch (sectionNumber) {
            case 1:
                txtSplashTitle.setText(R.string.appintro_title_1);
                txtSplashTitle.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
                txtSplashDesc.setText(R.string.appintro_desc_1);
                txtSplashDesc.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
//                imgBack.setImageResource(R.drawable.onlycity);
                relativeLayoutSplash.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.first));
//                relativeLayoutSplash.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.fragment_3));
                imgSelectedDot1.setVisibility(View.VISIBLE);
                imgSelectedDot2.setVisibility(View.INVISIBLE);
                imgSelectedDot3.setVisibility(View.INVISIBLE);
                imgSelectedDot4.setVisibility(View.INVISIBLE);
                break;
            case 2:
                txtSplashTitle.setText(R.string.appintro_title_2);
                txtSplashTitle.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
                txtSplashDesc.setText(R.string.appintro_desc_2);
                txtSplashDesc.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
//                imgSplash.setImageResource(R.drawable.search_use);
                relativeLayoutSplash.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.second));
                imgSelectedDot1.setVisibility(View.INVISIBLE);
                imgSelectedDot2.setVisibility(View.VISIBLE);
                imgSelectedDot3.setVisibility(View.INVISIBLE);
                imgSelectedDot4.setVisibility(View.INVISIBLE);
                break;
            case 3:
                txtSplashTitle.setText(R.string.appintro_title_3);
                txtSplashTitle.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
                txtSplashDesc.setText(R.string.appintro_desc_3);
                txtSplashDesc.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
//                imgSplash.setImageResource(R.drawable.discover);
                //relativeLayoutSplash.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimary));
                relativeLayoutSplash.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.third));
                imgSelectedDot1.setVisibility(View.INVISIBLE);
                imgSelectedDot2.setVisibility(View.INVISIBLE);
                imgSelectedDot3.setVisibility(View.VISIBLE);
                imgSelectedDot4.setVisibility(View.INVISIBLE);
                break;
            case 4:
                txtSplashTitle.setText(R.string.appintro_title_4);
                txtSplashTitle.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
                txtSplashDesc.setText(R.string.appintro_desc_4);
                txtSplashDesc.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
//                imgSplash.setImageResource(R.drawable.discover);
                //relativeLayoutSplash.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimary));
                relativeLayoutSplash.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.fourth));
                imgSelectedDot1.setVisibility(View.INVISIBLE);
                imgSelectedDot2.setVisibility(View.INVISIBLE);
                imgSelectedDot3.setVisibility(View.INVISIBLE);
                imgSelectedDot4.setVisibility(View.VISIBLE);
                break;
        }
    }
}