package templatemethod.mycode;

public abstract class AbstractTemplate {
    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();

    protected boolean hook() {
        return true;
    }

    public final void templateMethod() {
        step1();
        step2();
        if (hook()) {
            System.out.println("특정 로직 실행");
        }
        step3();
    }
}
