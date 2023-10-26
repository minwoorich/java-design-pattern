package bridge.구조;

public abstract class Abstraction  {
    protected final Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void implMethod1() {
        implementor.implMethod1();
    }

    public void implMethod2() {
        implementor.implMethod2();
    }

    abstract public void method1();
    abstract public void method2();
}
