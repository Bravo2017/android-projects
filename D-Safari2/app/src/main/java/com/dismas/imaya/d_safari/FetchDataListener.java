package com.dismas.imaya.d_safari;

import java.util.List;

/**
 * Created by imaya on 1/24/17.
 */

public interface FetchDataListener {
    public void onFetchComplete(List<Application> data);
    public void onFetchFailure(String msg);
}
