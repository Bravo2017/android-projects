package com.dismas.imaya.androidimageslideshow.json;

import android.os.Build;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by imaya on 7/7/16.
 */
public class GetJSONObject {
    public static JSONObject getJSONObject(String url) throws IOException,
            JSONException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = null;
        // Use HttpURLConnection
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.FROYO) {
            jsonObject = jsonParser.getJSONHttpURLConnection(url);
        } else {
            // use HttpClient
            jsonObject = jsonParser.getJSONHttpClient(url);
        }
        return jsonObject;
    }
}
