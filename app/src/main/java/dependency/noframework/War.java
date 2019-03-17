package dependency.noframework;

@SuppressWarnings("FieldCanBeLocal")
public class War {
    @SuppressWarnings("SpellCheckingInspection")
    private final Boltons boltons;
    private final Starks starks;

    public War(Boltons boltons, Starks starks) {
        this.boltons = boltons;
        this.starks = starks;

        this.starks.prepareForWar();
        this.starks.reportForWar();

        this.boltons.prepareForWar();
        this.boltons.prepareForWar();
    }


}
