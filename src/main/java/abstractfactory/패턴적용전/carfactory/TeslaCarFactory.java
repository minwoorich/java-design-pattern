package abstractfactory.패턴적용전.carfactory;

import abstractfactory.패턴적용전.Car;
import abstractfactory.패턴적용전.parts.TeslaDoor;
import abstractfactory.패턴적용전.parts.TeslaHandle;
import abstractfactory.패턴적용전.parts.TeslaSeat;
import abstractfactory.패턴적용전.parts.TeslaWheel;

public class TeslaCarFactory implements CarFactory {
    public Car create(){
        return new Car(new TeslaHandle(),
                new TeslaWheel(),
                new TeslaDoor(),
                new TeslaSeat());
    }
}
