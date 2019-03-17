package com.luisaguirre.daggersetup.di.module;

import android.app.Activity;
import android.content.Context;

import com.luisaguirre.daggersetup.di.RamdomUserApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    Context context;

    public ActivityModule(Activity context) {
        this.context = context;
    }

    @Named("activity_context")
    @RamdomUserApplicationScope
    @Provides
    Context getActivityContext() {
        return context;
    }

}
