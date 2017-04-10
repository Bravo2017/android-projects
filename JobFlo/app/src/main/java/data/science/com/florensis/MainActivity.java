package data.science.com.florensis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String str_getName, str_getPassword, str_getUserId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str_getName = SplashActivity.sh.getString("username", null);
        str_getPassword = SplashActivity.sh.getString("password", null);
        str_getUserId = SplashActivity.sh.getString("userid", null);
    }
    //    On click opens the connect activty which displays the spinner
    public void userCollect(View view){
        startActivity(new Intent(this, CollectActivity.class));
    }


    //    on click displays the list view activity
    public void userView(View view){
        startActivity(new Intent(this, ViewActivity.class));
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_logged_in, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent i = null;

        switch (item.getItemId()) {

            case R.id.action_logout:
                Toast.makeText(getApplicationContext(), "You have successfully logout", Toast.LENGTH_LONG).show();

                SplashActivity.editor.remove("loginTest");
                SplashActivity.editor.commit();

                Intent logout = new Intent(getApplicationContext(), SplashActivity.class);
                startActivity(logout);
                break;

            case R.id.action_about:
                break;
            case R.id.action_help:
                break;
            default:
                // Do nothing
        }

        if(i != null)
            startActivity(i);

        return super.onOptionsItemSelected(item);
    }
}
