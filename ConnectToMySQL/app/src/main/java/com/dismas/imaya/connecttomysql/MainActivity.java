package com.dismas.imaya.connecttomysql;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MainActivity extends AppCompatActivity {

    /** Called when the activity is first created. */

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.enableDefaults(); //STRICT MODE ENABLED

        resultView = (TextView) findViewById(R.id.result);

        getData();
    }
    public void getData(){

        String result = "";

        InputStream isr = null;

        try{

            HttpClient httpclient = new DefaultHttpClient();

            HttpPost httppost = new HttpPost("http://41.89.64.197/Myfile.php"); //YOUR PHP SCRIPT ADDRESS

// HttpPost httppost = new HttpPost("http://172.23.193.32/elift-test/myfile.php"); //YOUR PHP SCRIPT ADDRESS

            HttpResponse response = httpclient.execute(httppost);

            HttpEntity entity = response.getEntity();

            isr = entity.getContent();

        }

        catch(Exception e){

            Log.e("log_tag", "Error in http connection "+e.toString());

            resultView.setText("Couldnt connect to database");

        }

//convert response to string

        try{

            BufferedReader reader = new BufferedReader(new InputStreamReader(isr,"iso-8859-1"),8);

            StringBuilder sb = new StringBuilder();

            String line = null;

            while ((line = reader.readLine()) != null) {

                sb.append(line + "\n");

            }

            isr.close();

            result=sb.toString();

        }

        catch(Exception e){

            Log.e("log_tag", "Error  converting result "+e.toString());

        }

//parse json data

        try {

            String s = "";

            JSONArray jArray = new JSONArray(result);

            for(int i=0; i<jArray.length();i++){

                JSONObject json = jArray.getJSONObject(i);

                s = s +"Name : "+json.getString("id")+" "+json.getString("username");  }

            resultView.setText(s);

        } catch (Exception e) {

// TODO: handle exception

            Log.e("log_tag", "Error Parsing Data "+e.toString());

        }

    }
}
