package com.luisaguirre.daggersetup.di;

import com.luisaguirre.daggersetup.RamdomUserAdapter;
import com.luisaguirre.daggersetup.RamdomUsersApi;
import com.luisaguirre.daggersetup.di.module.MainActivityModule;

import dagger.Component;

@MainActivityScope
@Component(modules = {MainActivityModule.class} , dependencies = RamdomUserComponent.class)
public interface MainActivityComponent {
    RamdomUserAdapter getRandomUserAdapter();

    RamdomUsersApi getRandomUserService();
}
