package component;

import javax.inject.Inject;

import component.daggercomponent.AppComponent;
import component.daggercomponent.DaggerAppComponent;
import component.daggercomponent.PresenterSubComponent;
import component.daggermodule.ActivityModule;
import component.daggermodule.AppModule;
import component.daggermodule.PresenterModule;
import component.dependecies.ContextActivityFake;
import component.dependecies.ContextAppFake;
import component.dependecies.PresenterFake;

public class MainApplication {

    public static void main(String[] args) {

        AppComponent daggerAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(new ContextAppFake()))
                .build();

        daggerAppComponent.getRetrofit();

        PresenterSubComponent presenterSubComponent = daggerAppComponent
                .plusPresenterSubComponent(new PresenterModule(), new ActivityModule(new ContextActivityFake()));

        PresenterFake presenterFake = presenterSubComponent.getPresenter();


        presenterFake.println();


    }

}
