package templatemethod.mycode;

public class ImplementationB extends AbstractTemplate {
    @Override
    protected void step1() {
        System.out.println("B에서 step1 실행");
    }

    @Override
    protected void step2() {
        System.out.println("B에서 step2 실행");
    }

    @Override
    protected void step3() {
        System.out.println("B에서 step3 실행");
    }

    @Override
    protected boolean hook() {
        return true;
    }
}
