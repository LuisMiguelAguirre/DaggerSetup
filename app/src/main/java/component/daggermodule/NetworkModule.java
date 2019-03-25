package component.daggermodule;

import component.dependecies.ContextAppFake;
import component.dependecies.RetrofitFake;
import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    public RetrofitFake providesRetrofitModule(ContextAppFake contextAppFake) {
        return new RetrofitFake(contextAppFake);
    }
}
