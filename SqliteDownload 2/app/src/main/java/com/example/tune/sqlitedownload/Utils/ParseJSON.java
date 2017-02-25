package com.example.tune.sqlitedownload.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;




public class ParseJSON {
    public static String[] ids;
    public static String[] names;
    public static String[] status;

    public static final String JSON_ARRAY = "data";
    public static final String KEY_ID = "pestid";
    public static final String KEY_NAME = "pestname";
    public static final String KEY_STATUS = "status";

    private JSONArray pests = null;

    private String json;

    public ParseJSON(String json) {
        this.json = json;
    }

    public void parseJSON() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(json);
            pests = jsonObject.getJSONArray(JSON_ARRAY);

            ids = new String[pests.length()];
            names = new String[pests.length()];
            status = new String[pests.length()];

            for (int i = 0; i < pests.length(); i++) {
                JSONObject jo = pests.getJSONObject(i);
                ids[i] = jo.getString(KEY_ID);
                names[i] = jo.getString(KEY_NAME);
                status[i] = jo.getString(KEY_STATUS);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
