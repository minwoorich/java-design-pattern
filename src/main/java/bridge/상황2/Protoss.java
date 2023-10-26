package bridge.상황2;

public class Protoss extends Species{
    public Protoss(Unit unit) {
        super(unit);
    }

    @Override
    protected void speak() {
        System.out.println("아둔 토리다스!!");
    }
}
