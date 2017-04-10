package data.science.com.florensis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tune on 27/02/2017.
 */

public class DataAdapter extends ArrayAdapter {

    List list = new ArrayList();
    public DataAdapter(Context context, int resource){
        super(context, resource);
    }


    public void add(Data object) {
        list.add(object);
        super.add(object);
    }


    public int getCount(){
        return list.size();
    }
    public Object getItem(int position){
        return list.get(position);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row= convertView;
        ProductHolder productHolder;
        if (row == null){
            LayoutInflater layoutInflater= (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.activity_view,parent,false);
            productHolder = new ProductHolder();
            productHolder.g_name = (TextView) row.findViewById(R.id.g_name);
            productHolder.b_name = (TextView) row.findViewById(R.id.b_name);
            row.setTag(productHolder);

        }else {
            productHolder = (ProductHolder) row.getTag();
        }

        Data data = (Data) getItem(position);
         productHolder.g_name.setText(data.getGreenhouse().toString());
        productHolder.b_name.setText(data.getBedID().toString());
        return row;
    }

    static class ProductHolder{
      TextView g_name, b_name;
    }
}
