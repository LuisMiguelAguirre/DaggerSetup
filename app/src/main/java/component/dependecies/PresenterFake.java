package component.dependecies;

import javax.inject.Inject;

public class PresenterFake implements IPresenterFake{

    @Inject
    public PresenterFake(ContextActivityFake contextActivityFake, ContextAppFake contextAppFake, RetrofitFake retrofitFake) {
        System.out.println("Return presenter fake..." + contextActivityFake.toString());
        System.out.println("contextAppFake..." + contextAppFake.toString());
        System.out.println("retrofitFake fake..." + retrofitFake.toString());

    }

    @Override
    public void println() {
        System.out.println("printing something ");
    }
}
