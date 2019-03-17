package com.luisaguirre.daggersetup.di.module;

import android.content.Context;

import com.luisaguirre.daggersetup.di.RamdomUserApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Named("application_context")
    @RamdomUserApplicationScope
    @Provides
    public Context context()  {
        return context.getApplicationContext();
    }
}
