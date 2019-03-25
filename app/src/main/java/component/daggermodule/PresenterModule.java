package component.daggermodule;

import component.dependecies.ContextActivityFake;
import component.dependecies.ContextAppFake;
import component.dependecies.PresenterFake;
import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    public PresenterFake providesPresenterFake(ContextActivityFake contextActivityFake, ContextAppFake contextAppFake) {
        return new PresenterFake(contextActivityFake, contextAppFake);
    }
}
