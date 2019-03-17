package com.luisaguirre.daggersetup;

import android.app.Activity;
import android.app.Application;

import com.luisaguirre.daggersetup.di.DaggerRamdomUserComponent;
import com.luisaguirre.daggersetup.di.RamdomUserComponent;
import com.luisaguirre.daggersetup.di.module.ContextModule;

import timber.log.Timber;

public class RamdomUserApplication extends Application {

    private RamdomUserComponent ramdomUserApplicationComponent;

    public static RamdomUserApplication get(Activity activity){
        return (RamdomUserApplication) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        ramdomUserApplicationComponent = DaggerRamdomUserComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }

    public RamdomUserComponent getRandomUserApplicationComponent(){
        return ramdomUserApplicationComponent;
    }

}
