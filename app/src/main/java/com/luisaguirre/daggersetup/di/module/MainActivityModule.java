package com.luisaguirre.daggersetup.di.module;

import android.app.Activity;
import android.content.Context;

import com.luisaguirre.daggersetup.MainActivity;
import com.luisaguirre.daggersetup.RamdomUserAdapter;
import com.luisaguirre.daggersetup.di.MainActivityScope;
import com.luisaguirre.daggersetup.di.RamdomUserApplicationScope;
import com.squareup.picasso.Picasso;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    MainActivity mainActivity;

    public MainActivityModule(MainActivity context) {
        this.mainActivity = context;
    }

    @Named("activity_context")
    @MainActivityScope
    @Provides
    Context getActivityContext() {
        return mainActivity;
    }

    @Provides
    @MainActivityScope
    public RamdomUserAdapter randomUserAdapter(Picasso picasso){
        return new RamdomUserAdapter(mainActivity, picasso);
    }

}
