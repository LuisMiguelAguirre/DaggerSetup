package externaldependency;

public class Soldiers {
    private Soldiers() {
    }

    public static Soldiers getInstance() {
        return new Soldiers();
    }
}
