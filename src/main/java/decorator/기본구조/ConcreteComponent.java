package decorator.기본구조;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("ConcreteComponent");
    }
}
