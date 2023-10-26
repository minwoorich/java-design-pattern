package bridge.상황2;

public class Terran extends Species{
    public Terran(Unit unit) {
        super(unit);
    }

    @Override
    protected void speak() {
        System.out.println("You wanna piece of me!!");
    }
}
