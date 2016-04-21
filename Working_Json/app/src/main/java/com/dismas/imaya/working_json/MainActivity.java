package com.dismas.imaya.working_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.dismas.imaya.working_json.model.Evrybit;
import com.dismas.imaya.working_json.model.Objects;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    RestClient restClient;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restClient = new RestClient();


        tvResult = (TextView) findViewById(R.id.txtResult);

        restClient.getService().getArrayWithObjects(new Callback<Evrybit>() {
            @Override
            public void success(Evrybit evrybit, Response response) {
                String result = "";
                tvResult.setMovementMethod(new ScrollingMovementMethod());
                    for (int i = 0; i < evrybit.objects.size(); i++) {

                        result +="Title: " + evrybit.objects.get(i).title + '\n' +
                                "Intro: " + Html.fromHtml(evrybit.objects.get(i).intro).toString().trim() + "\n" +
                                "User Id: " + evrybit.objects.get(i).user_id + '\n' +
                                "Timestamp: " + evrybit.objects.get(i).timestamp + "\n\n";
                    }
                tvResult.setText(result);
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(MainActivity.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}

