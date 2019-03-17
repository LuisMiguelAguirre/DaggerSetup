package dependency.noframework;

public class Starks implements House {

    @Override
    public void prepareForWar() {
        System.out.println(getClass().getSimpleName() + "prepareForWar()");
    }

    @Override
    public void reportForWar() {
        System.out.println(getClass().getSimpleName() + "reportForWar()");
    }
}
