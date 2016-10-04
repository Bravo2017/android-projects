package com.dismas.imaya.gatekeeper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonVerify();
        addListenerOnButtonSetPoint();
        addListenerOnButtonExit();
    }
    public void addListenerOnButtonVerify() {

        final Context context = this;

        button = (Button) findViewById(R.id.verify);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ResultsActivity.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButtonSetPoint() {

        final Context context = this;

        button = (Button) findViewById(R.id.setpoint);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ResultsActivity.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButtonExit() {

        final Context context = this;

        button = (Button) findViewById(R.id.exit);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                finish();

            }

        });

    }
}
