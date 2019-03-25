package component.daggercomponent;

import component.MainApplication;
import component.daggermodule.ActivityModule;
import component.daggermodule.PresenterModule;
import component.dependecies.PresenterFake;
import dagger.Subcomponent;

@Subcomponent(modules = {PresenterModule.class, ActivityModule.class})
public interface PresenterSubComponent {

    PresenterFake getPresenter();

    void inject(MainApplication mainApplication);

}
