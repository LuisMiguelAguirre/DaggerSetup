package nodependecy;

@SuppressWarnings("FieldCanBeLocal")
public class War {
    @SuppressWarnings("SpellCheckingInspection")
    private final Boltons boltons;
    private final Starks starks;

    public War() {
        starks = new Starks();
        boltons = new Boltons();

        starks.prepareForWar();
        starks.reportForWar();

        boltons.prepareForWar();
        boltons.prepareForWar();
    }


}
