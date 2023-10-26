package bridge.상황1_브릿지패턴사용X;

public class Client {
    public static void main(String[] args) {
//        Unit air = new AirUnit();
//        Unit ground = new GroundUnit();

        Unit airProtoss = new AirProtoss();
        Unit airTerran = new AirTerran();
        Unit groundProtoss = new GroundProtoss();
        Unit groundTerran = new GroundTerran();
    }
}
