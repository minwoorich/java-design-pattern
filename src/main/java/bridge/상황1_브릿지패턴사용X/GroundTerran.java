package bridge.상황1_브릿지패턴사용X;

public class GroundTerran implements Unit{
    @Override
    public void move() {
        System.out.println("걸어서 이동합니다");
    }

    @Override
    public void attack() {
        System.out.println("지상에서 공격합니다");
    }

    public void speak() {
        System.out.println("You wanna piece of me!!!");
    }
}
