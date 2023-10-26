package bridge.상황2;

public class Client {
    public static void main(String[] args) {
        // 기존에 쓰던 예전 버전 unit
        Unit unit1 = new AirUnit();
        Unit unit2 = new AirUnit();

        // 종족이 추가된 업그레이드 버전 unit
        Species newUnit1 = new Protoss(new AirUnit());
        Species newUnit2 = new Terran(new GroundUnit());

        // 공중 프로토스 유닛
        newUnit1.move();
        newUnit1.attack();
        newUnit1.speak();
        System.out.println("------------");
        // 지상 테란 유닛
        newUnit2.move();
        newUnit2.attack();
        newUnit2.speak();

    }
}
