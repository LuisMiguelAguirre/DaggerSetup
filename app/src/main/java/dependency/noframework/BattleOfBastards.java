package dependency.noframework;

public class BattleOfBastards {

    public static void main(String[] args) {
        War war = new War(new Boltons(), new Starks());
    }
}
