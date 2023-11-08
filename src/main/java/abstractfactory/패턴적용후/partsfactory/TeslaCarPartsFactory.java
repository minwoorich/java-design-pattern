package abstractfactory.패턴적용후.partsfactory;

import abstractfactory.패턴적용후.parts.*;

public class TeslaCarPartsFactory implements CarPartsFactory{
    @Override
    public Handle createHandle() {
        return new TeslaHandle();
    }

    @Override
    public Wheel createWheel() {
        return new TeslaWheel();
    }

    @Override
    public Door createDoor() {
        return new TeslaDoor();
    }

    @Override
    public Seat createSeat() {
        return new TeslaSeat();
    }
}
