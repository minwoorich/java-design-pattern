package mediator;

public class Main {
    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower(new Runway(true));

        // 비행기 생성 (관제탑, 활주로 등록)
        Flight flightA = new FlightA(controlTower);
        Flight flightB = new FlightB(controlTower);

        // 관제탑에 비행기, 활주로 등록
        controlTower.registerFlight(flightA);
        controlTower.registerFlight(flightB);

        // 비행기 A 착륙 요청
        flightA.land();

        // 비행기 B 착륙 요청
        flightB.land();

        // 비행기 A 이륙(활주로 빔)
        flightA.takeOff();

        //비행기 B 착륙 요청
        flightB.land();
    }
}
