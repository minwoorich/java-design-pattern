package bridge.상황2;

public class AirUnit implements Unit{
    @Override
    public void move() {
        System.out.println("날아서 이동합니다");
    }

    @Override
    public void attack() {
        System.out.println("공중에서 공격합니다");
    }
}
