package component.daggercomponent;

import component.MainApplication;
import component.daggermodule.PresenterModule;
import component.dependecies.ContextActivityFake;
import component.dependecies.PresenterFake;
import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent(modules = {PresenterModule.class})
public interface PresenterSubComponent {

    PresenterFake getPresenter();

    void inject(MainApplication mainApplication);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance Builder activityContext(ContextActivityFake contextActivityFake);
        PresenterSubComponent build();
    }
}
