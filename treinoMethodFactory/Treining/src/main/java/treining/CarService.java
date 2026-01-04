package treining;

import treining.factory.CarFactory;

public class CarService {

    private CarFactory carFactory;

    public CarService(CarFactory carFactory) {

        this.carFactory = carFactory;

    }

    public void execute(CarFactory carFactory) {

        Car car = carFactory.createCar();
        System.out.println(car.getName());

    }


}
