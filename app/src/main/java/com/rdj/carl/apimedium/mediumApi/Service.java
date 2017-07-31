package com.rdj.carl.apimedium.mediumApi;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SEVEN on 7/27/2017.
 */

public interface Service {
    @GET(Constants.URL_GET_USER)
    Call<JsonObject> getDataUser();
}
