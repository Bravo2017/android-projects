package com.dismas.imaya.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by imaya on 3/2/16.
 */
public class chat extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, backmenu.class);
                startActivity(intent);

            }

        });

    }


}
