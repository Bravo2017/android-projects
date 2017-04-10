package data.science.com.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by imaya on 2/26/17.
 */

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList image_details = getListData();
        final ListView lv1 = (ListView) findViewById(R.id.custom_list);
        lv1.setAdapter(new CustomListAdapter(this, image_details));
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                NewsItem newsData = (NewsItem) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList getListData() {
        ArrayList<NewsItem> results = new ArrayList<NewsItem>();
        NewsItem newsData = new NewsItem();
        newsData.setHeadline("Dance of Democracy");
        newsData.setReporterName("Pankaj Gupta");
        newsData.setDate("May 26, 2013, 13:35");

        newsData.setHeadline("Dance of Democracy");
        newsData.setReporterName("Pankaj Gupta");
        newsData.setDate("May 26, 2013, 13:35");

        newsData.setHeadline("Dance of Democracy");
        newsData.setReporterName("Pankaj Gupta");
        newsData.setDate("May 26, 2013, 13:35");
        results.add(newsData);

        // Add some more dummy data for testing
        return results;
    }
}