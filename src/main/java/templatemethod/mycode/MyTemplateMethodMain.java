package templatemethod.mycode;

public class MyTemplateMethodMain {
    public static void main(String[] args) {
        AbstractTemplate templateA = new ImplementationA();
        AbstractTemplate templateB = new ImplementationB();

        templateA.templateMethod();
        templateB.templateMethod();
    }
}
