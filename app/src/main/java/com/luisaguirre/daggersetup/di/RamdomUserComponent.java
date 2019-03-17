package com.luisaguirre.daggersetup.di;

import com.luisaguirre.daggersetup.RamdomUsersApi;
import com.luisaguirre.daggersetup.di.module.PicassoModule;
import com.luisaguirre.daggersetup.di.module.RamdomUsersModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

@RamdomUserApplicationScope
@Component(modules = {RamdomUsersModule.class, PicassoModule.class})
public interface RamdomUserComponent {

    RamdomUsersApi getRamdomUserService();
    Picasso getPicasso();

}
