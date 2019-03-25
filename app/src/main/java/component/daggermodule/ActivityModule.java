package component.daggermodule;

import component.dependecies.ContextActivityFake;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    ContextActivityFake contextActivityFake;

    public ActivityModule(ContextActivityFake contextActivityFake) {
        this.contextActivityFake = contextActivityFake;
    }

    @Provides
    public ContextActivityFake getContextActivityFake() {
        return contextActivityFake;
    }
}
