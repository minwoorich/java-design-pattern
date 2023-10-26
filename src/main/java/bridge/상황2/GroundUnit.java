package bridge.상황2;

public class GroundUnit implements Unit {
    @Override
    public void move() {
        System.out.println("걸어서 이동합니다");
    }

    @Override
    public void attack() {
        System.out.println("지상에서 공격합니다");
    }
}
