package component.dependecies;

public class RetrofitFake {
    public RetrofitFake(ContextAppFake contextAppFake) {
        System.out.println("Return retrofit fake ..." + contextAppFake.toString());
    }
}
