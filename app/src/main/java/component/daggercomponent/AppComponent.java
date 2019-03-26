package component.daggercomponent;

import component.daggermodule.ActivityModule;
import component.daggermodule.AppModule;
import component.daggermodule.PresenterModule;
import component.dependecies.RetrofitFake;
import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {

    RetrofitFake getRetrofit();

    PresenterSubComponent.Builder presenterSubComponentBuilder();
}
