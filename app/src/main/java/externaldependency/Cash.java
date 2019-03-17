package externaldependency;

public class Cash {

    private Cash() {
    }

    public static Cash getInstance() {
        return new Cash();
    }
}
