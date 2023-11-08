package abstractfactory.패턴적용후.carfactory;

import abstractfactory.패턴적용후.Car;
import abstractfactory.패턴적용후.partsfactory.CarPartsFactory;

public abstract class CarFactory {
    protected final CarPartsFactory partsFactory;

    public CarFactory(CarPartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    abstract public Car create();
}
