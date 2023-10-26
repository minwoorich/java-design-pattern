package bridge.상황2;

public abstract class Species {
    protected Unit unit;

    public Species(Unit unit) {
        this.unit = unit;
    }

    abstract protected void speak();

    public void move() {
        unit.move();
    }

    public void attack() {
        unit.attack();
    }
}
