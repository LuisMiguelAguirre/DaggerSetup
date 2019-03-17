package com.luisaguirre.daggersetup;

import com.luisaguirre.daggersetup.model.RamdomUsers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RamdomUsersApi {

    @GET("api")
    Call<RamdomUsers> getRamdomUsers(@Query("results") int size);
}
