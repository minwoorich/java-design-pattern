package abstractfactory.팩토리메서드사용;

public class TeslaCarFactory implements CarFactory {
    public Car create(){
        return new Car(new Handle(), new Wheel());
    }
}
