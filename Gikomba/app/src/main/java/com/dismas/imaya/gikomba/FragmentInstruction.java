package com.dismas.imaya.gikomba;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by imaya on 3/15/16.
 */
public class FragmentInstruction extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();
        String instruction;
        String title;
        if(bundle!=null){
            instruction = bundle.getString("instruction");
        } else {
            instruction = "Open the drawer with the menu icon."
                    + "Then choose the category and the example, which you want to see.";
        }
        TextView textView = new TextView(this.getActivity());
        textView.setText(instruction);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }
}
