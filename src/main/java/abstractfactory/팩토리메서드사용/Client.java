package abstractfactory.팩토리메서드사용;

public class Client {
    public static void main(String[] args) {
        Car car = new CarFactory(new Wheel(), new Handle()).create();
    }
}
