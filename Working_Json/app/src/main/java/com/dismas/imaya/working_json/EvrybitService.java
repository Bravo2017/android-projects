package com.dismas.imaya.working_json;

import com.dismas.imaya.working_json.model.Evrybit;
import com.dismas.imaya.working_json.model.Objects;

import java.util.List;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by imaya on 4/21/16.
 */
public interface EvrybitService {
    @GET("/evrybit/api/v2/story")
    public void getArrayWithObjects(Callback<Evrybit> callback);

}
