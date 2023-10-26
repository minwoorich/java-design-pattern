package bridge.구조;

public class ConcreteImplementor implements Implementor{
    @Override
    public void implMethod1() {
        System.out.println("기능1 입니다");
    }

    @Override
    public void implMethod2() {
        System.out.println("기능2 입니다");
    }
}
