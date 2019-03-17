package com.luisaguirre.daggersetup.di.module;

import android.content.Context;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.luisaguirre.daggersetup.di.RamdomUserApplicationScope;
import com.squareup.picasso.Picasso;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module(includes = OkHttpClientModule.class)
public class PicassoModule {

    @RamdomUserApplicationScope
    @Provides
    public Picasso picasso(@Named("application_context") Context context, OkHttp3Downloader okHttp3Downloader){
        return new Picasso.Builder(context).
                downloader(okHttp3Downloader).
                build();
    }

    @Provides
    public OkHttp3Downloader okHttp3Downloader(OkHttpClient okHttpClient){
        return new OkHttp3Downloader(okHttpClient);
    }

}
