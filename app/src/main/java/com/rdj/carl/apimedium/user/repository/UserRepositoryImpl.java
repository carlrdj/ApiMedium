package com.rdj.carl.apimedium.user.repository;

import android.widget.Toast;

import com.google.gson.JsonObject;
import com.rdj.carl.apimedium.mediumApi.RestApiAdapter;
import com.rdj.carl.apimedium.mediumApi.Service;
import com.rdj.carl.apimedium.user.model.User;
import com.rdj.carl.apimedium.user.presenter.UserPresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SEVEN on 7/27/2017.
 */

public class UserRepositoryImpl implements UserRepository{
    private UserPresenter userPresenter;

    public UserRepositoryImpl(UserPresenter userPresenter) {
        this.userPresenter = userPresenter;
    }

    @Override
    public void getDataUser() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<JsonObject> call =  service.getDataUser();

        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                JsonObject userJson = response.body().getAsJsonObject("data");

                User user = new User(
                        userJson.get("id").getAsString(),
                        userJson.get("name").getAsString(),
                        userJson.get("username").getAsString(),
                        userJson.get("url").getAsString(),
                        userJson.get("imageUrl").getAsString()
                );

                userPresenter.showDataUser(user);
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });

    }
}
