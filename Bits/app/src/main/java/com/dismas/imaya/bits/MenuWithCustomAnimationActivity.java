package com.dismas.imaya.bits;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.imaya.circularfloatingactionmenu.libraryFloat.FloatingActionButton;
import com.imaya.circularfloatingactionmenu.libraryFloat.FloatingActionMenu;
import com.imaya.circularfloatingactionmenu.libraryFloat.SubActionButton;

/**
 * Created by imaya on 4/6/16.
 */
public class MenuWithCustomAnimationActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_with_custom_animation);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new CustomAnimationDemoFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_with_custom_animation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class CustomAnimationDemoFragment extends Fragment {

        public CustomAnimationDemoFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_menu_with_custom_animation, container, false);

            ImageView fabContent = new ImageView(getActivity());
            fabContent.setImageDrawable(getResources().getDrawable(R.drawable.ic_action_settings));

            FloatingActionButton darkButton = new FloatingActionButton.Builder(getActivity())
                    .setTheme(FloatingActionButton.THEME_DARK)
                    .setContentView(fabContent)
                    .setPosition(FloatingActionButton.POSITION_BOTTOM_CENTER)
                    .build();

            SubActionButton.Builder rLSubBuilder = new SubActionButton.Builder(getActivity())
                    .setTheme(SubActionButton.THEME_DARK);
            ImageButton rlIcon1 = new ImageButton(getActivity());
            ImageButton rlIcon2 = new ImageButton(getActivity());
            ImageButton rlIcon3 = new ImageButton(getActivity());
            ImageButton rlIcon4 = new ImageButton(getActivity());
            ImageButton rlIcon5 = new ImageButton(getActivity());

            rlIcon1.setImageDrawable(getResources().getDrawable(R.drawable.ic_action_chat));
            rlIcon2.setImageDrawable(getResources().getDrawable(R.drawable.ic_action_camera));
            rlIcon3.setImageDrawable(getResources().getDrawable(R.drawable.ic_action_video));
            rlIcon4.setImageDrawable(getResources().getDrawable(R.drawable.ic_action_place));
            rlIcon5.setImageDrawable(getResources().getDrawable(R.drawable.ic_action_headphones));

            // Set 4 SubActionButtons
            FloatingActionMenu centerBottomMenu = new FloatingActionMenu.Builder(getActivity())
                    .setStartAngle(0)
                    .setEndAngle(-180)
                    .setAnimationHandler(new SlideInAnimationHandler())
                    .addSubActionView(rLSubBuilder.setContentView(rlIcon1).build())
                    .addSubActionView(rLSubBuilder.setContentView(rlIcon2).build())
                    .addSubActionView(rLSubBuilder.setContentView(rlIcon3).build())
                    .addSubActionView(rLSubBuilder.setContentView(rlIcon4).build())
                    .addSubActionView(rLSubBuilder.setContentView(rlIcon5).build())
                    .attachTo(darkButton)
                    .build();

            rlIcon1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getActivity(), MainDrawing.class);
                    startActivity(intent);
                }
            });

            rlIcon2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getActivity(), MainCamera.class);
                    startActivity(intent);
                }
            });

            rlIcon3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getActivity(), MainVideoCamera.class);
                    startActivity(intent);
                }
            });

            rlIcon4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getActivity(), MainSound.class);
                    startActivity(intent);
                }
            });

            rlIcon5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getActivity(), MainSound.class);
                    startActivity(intent);
                }
            });

            return rootView;
        }
    }
}