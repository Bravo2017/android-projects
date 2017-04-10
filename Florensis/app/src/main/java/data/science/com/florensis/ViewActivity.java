package data.science.com.florensis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_layout_product);

        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute("get_info");
    }
}