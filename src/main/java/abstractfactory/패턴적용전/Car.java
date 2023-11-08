package abstractfactory.패턴적용전;

import abstractfactory.패턴적용전.parts.Door;
import abstractfactory.패턴적용전.parts.Handle;
import abstractfactory.패턴적용전.parts.Seat;
import abstractfactory.패턴적용전.parts.Wheel;

public class Car {
    private final Handle handle;
    private final Wheel wheel;
    private final Door door;
    private final Seat seat;

    public Car(Handle handle, Wheel wheel, Door door, Seat seat) {
        this.handle = handle;
        this.wheel = wheel;
        this.door = door;
        this.seat = seat;
    }
}
