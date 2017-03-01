package data.science.com.florensis;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.HashMap;
import java.util.List;



public class ListAdapter extends ArrayAdapter {

    private String[] arrText =
            new String[]{"No of Thrips","No of White fly","No of Black fly"};
    Context context;
    int textViewResourceId;
    private static final String TAG = "ListAdapter" ;
    HashMap hashMap = new HashMap();

    public ListAdapter(Context context, int textViewResourceId,
                              List objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        this.textViewResourceId = textViewResourceId;
        for (int i = 0; i < objects.size(); ++i) {
            hashMap.put(objects.get(i), i);
        }
    }

//    @Override
//    public long getItemId(int position) {
//        String item = (String) getItem(position);
//        return (long) hashMap.get(item);
//    }

    @Override
    public boolean hasStableIds() {
        return true;
    }
}
