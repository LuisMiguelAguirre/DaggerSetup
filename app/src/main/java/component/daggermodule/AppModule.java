package component.daggermodule;

import component.dependecies.ContextAppFake;
import dagger.Module;
import dagger.Provides;

@Module(includes = NetworkModule.class)
public class AppModule {

    private ContextAppFake contextAppFake;

    public AppModule(ContextAppFake contextAppFake) {
        this.contextAppFake = contextAppFake;
    }

    @Provides
    public ContextAppFake provideContextAppFake() {
        return contextAppFake;
    }
}
