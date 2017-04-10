package data.science.com.florensis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //    On click opens the connect activty which displays the spinner
    public void userCollect(View view){

        startActivity(new Intent(this, CollectActivity.class));
    }


    //    on click displays the list view activity
    public void userView(View view){
        startActivity(new Intent(this, ViewActivity.class));
    }

}
