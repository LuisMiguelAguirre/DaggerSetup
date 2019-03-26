package component.dependecies;

import javax.inject.Inject;

public class PresenterFake implements IPresenterFake{

    @Inject
    public PresenterFake(ContextActivityFake contextActivityFake, ContextAppFake contextAppFake) {
        System.out.println("Return presenter fake..." + contextActivityFake.toString());
    }

    @Override
    public void println() {
        System.out.println("printing something");
    }
}
