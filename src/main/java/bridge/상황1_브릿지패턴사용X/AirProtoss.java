package bridge.상황1_브릿지패턴사용X;

public class AirProtoss implements Unit{
    @Override
    public void move() {
        System.out.println("날아서 이동합니다");
    }

    @Override
    public void attack() {
        System.out.println("공중에서 공격합니다");
    }

    public void speak() {
        System.out.println("아둔 토리다스!!");
    }
}
