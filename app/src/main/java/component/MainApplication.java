package component;

import component.daggercomponent.AppComponent;
import component.daggercomponent.DaggerAppComponent;
import component.daggercomponent.PresenterSubComponent;
import component.daggermodule.AppModule;
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
                .presenterSubComponentBuilder()
                .activityContext(new ContextActivityFake())
                .build();

        PresenterFake presenterFake = presenterSubComponent.getPresenter();

        presenterFake.println();
    }

}
