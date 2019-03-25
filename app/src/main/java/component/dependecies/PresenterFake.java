package component.dependecies;

public class PresenterFake {
    public PresenterFake(ContextActivityFake contextActivityFake, ContextAppFake contextAppFake) {
        System.out.println("Return presenter fake..." + contextActivityFake.toString());
    }

    public void println() {
        System.out.println("printing something");
    }
}
