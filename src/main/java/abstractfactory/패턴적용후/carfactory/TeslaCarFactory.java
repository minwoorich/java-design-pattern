package abstractfactory.패턴적용후.carfactory;

import abstractfactory.패턴적용후.Car;
import abstractfactory.패턴적용후.partsfactory.CarPartsFactory;

public class TeslaCarFactory extends CarFactory {
    public TeslaCarFactory(CarPartsFactory partsFactory) {
        super(partsFactory);
    }

    public Car create(){
        return new Car(
                partsFactory.createHandle(),
                partsFactory.createWheel(),
                partsFactory.createDoor(),
                partsFactory.createSeat());
    }
}
