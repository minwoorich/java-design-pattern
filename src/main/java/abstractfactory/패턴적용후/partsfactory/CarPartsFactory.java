package abstractfactory.패턴적용후.partsfactory;

import abstractfactory.패턴적용후.parts.Door;
import abstractfactory.패턴적용후.parts.Handle;
import abstractfactory.패턴적용후.parts.Seat;
import abstractfactory.패턴적용후.parts.Wheel;

public interface CarPartsFactory {
    Handle createHandle();
    Wheel createWheel();
    Door createDoor();
    Seat createSeat();
}
