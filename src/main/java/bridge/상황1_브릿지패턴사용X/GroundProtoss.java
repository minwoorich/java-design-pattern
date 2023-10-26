package bridge.상황1_브릿지패턴사용X;

public class GroundProtoss implements Unit{
    @Override
    public void move() {
        System.out.println("걸어서 이동합니다");
    }

    @Override
    public void attack() {
        System.out.println("지상에서 공격합니다");
    }

    public void speak() {
        System.out.println("아둔 토리다스!!");
    }
}
