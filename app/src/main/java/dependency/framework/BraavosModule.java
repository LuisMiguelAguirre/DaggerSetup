package dependency.framework;

import dagger.Module;
import dagger.Provides;
import externaldependency.Cash;
import externaldependency.Soldiers;

@Module
public class BraavosModule {

    private Cash cash;
    private Soldiers soldiers;

    public BraavosModule(Cash cash, Soldiers soldiers) {
        this.cash = cash;
        this.soldiers = soldiers;
    }

    @Provides
    public Cash provideCash() {
        return cash;
    }

    @Provides
    public Soldiers provideSoldiers() {
        return soldiers;
    }

}
