package dependency.framework;

import javax.inject.Inject;

public class Starks implements House {

    @Inject
    public Starks() {
    }

    @Override
    public void prepareForWar() {
        System.out.println(getClass().getSimpleName() + " prepareForWar() with dagger 2");
    }

    @Override
    public void reportForWar() {
        System.out.println(getClass().getSimpleName() + " reportForWar() with dagger 2");
    }
}
