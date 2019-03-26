package component.daggermodule;

import component.dependecies.IPresenterFake;
import component.dependecies.PresenterFake;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PresenterModule {

    @Binds
    public abstract IPresenterFake providesPresenterFake(PresenterFake presenterFake);
}
