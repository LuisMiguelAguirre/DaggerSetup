package com.luisaguirre.daggersetup.di;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.luisaguirre.daggersetup.RamdomUsersApi;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = {OkHttpClientModule.class})
public class RamdomUsersModule {

    @Provides
    public RamdomUsersApi randomUsersApi(Retrofit retrofit){
        return retrofit.create(RamdomUsersApi.class);
    }

    @Provides
    public Retrofit retrofit(OkHttpClient okHttpClient,
                             GsonConverterFactory gsonConverterFactory, Gson gson){
        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://randomuser.me/")
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Provides
    public Gson gson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
    public GsonConverterFactory gsonConverterFactory(Gson gson){
        return GsonConverterFactory.create(gson);
    }
}
