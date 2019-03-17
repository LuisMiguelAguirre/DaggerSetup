package dependency.framework;

import dagger.Component;
import externaldependency.Cash;
import externaldependency.Soldiers;

@Component(modules = {BraavosModule.class})
public interface BattleComponent {
    War getWar();
    Starks getStarks();
    Boltons getBoltons();
    Cash getCash();
    Soldiers getSoldiers();
}
