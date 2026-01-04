package treining.factory;

import treining.Car;
import treining.Fiat;

public class FiatFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Fiat();

    }

}
