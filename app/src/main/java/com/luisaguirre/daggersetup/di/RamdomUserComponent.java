package com.luisaguirre.daggersetup.di;

import com.luisaguirre.daggersetup.RamdomUsersApi;
import com.squareup.picasso.Picasso;

import dagger.Component;

@Component(modules = {RamdomUsersModule.class, PicassoModule.class})
public interface RamdomUserComponent {

    RamdomUsersApi getRamdomUserService();
    Picasso getPicasso();

}
