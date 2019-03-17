package dependency.framework;

import externaldependency.Cash;
import externaldependency.Soldiers;

public class BattleOfBastards {

    public static void main(String[] args) {

        //One way to create component object, only available if @module does not exits
        //BattleComponent battleComponent1 = DaggerBattleComponent.create();
        //battleComponent1.getWar();

        //Other way to create the component object. Create calls builder.build()
        BattleComponent battleComponent2 = DaggerBattleComponent.builder().build();

        battleComponent2.getWar();

        //Cash and Soldiers simulates instances we cannot create, like android context
        Cash cash = Cash.getInstance();
        Soldiers soldiers = Soldiers.getInstance();

        BattleComponent battleComponent3 = DaggerBattleComponent.builder()
                .braavosModule(new BraavosModule(cash, soldiers))
                .build();

        battleComponent3.getSoldiers();
        battleComponent3.getCash();

    }
}
