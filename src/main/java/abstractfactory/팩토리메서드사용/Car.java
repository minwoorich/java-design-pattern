package abstractfactory.팩토리메서드사용;

public class Car {
    private final Handle handle;
    private final Wheel wheel;

    public Car(Handle handle, Wheel wheel) {
        this.handle = handle;
        this.wheel = wheel;
    }
}
