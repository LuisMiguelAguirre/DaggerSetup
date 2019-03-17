package nodependecy;

public class Boltons implements House {
    @Override
    public void prepareForWar() {
        System.out.println(getClass().getSimpleName() + "prepareForWar()");
    }

    @Override
    public void reportForWar() {
        System.out.println(getClass().getSimpleName() + "reportForWar()");
    }
}
