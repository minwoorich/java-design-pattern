package mediator;

public class FlightB implements Flight{
    private final ControlTower controlTower;

    public FlightB(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void land() {
        if (controlTower.isAvailable()) {
            System.out.println("비행기B, 착륙 허가 받음");
            return;
        }
        System.out.println("비행기B, 착륙 불가");
    }

    @Override
    public void takeOff() {
        System.out.println("비행기 B 이륙했습니다");
        controlTower.setRunwayAvailable();
    }
}
