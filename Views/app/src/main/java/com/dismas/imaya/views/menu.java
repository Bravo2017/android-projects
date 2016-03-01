package com.dismas.imaya.views;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * Created by imaya on 3/1/16.
 */
public class menu extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button8);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, home.class);
                startActivity(intent);

            }

        });

    }

}