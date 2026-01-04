package treining;

import treining.CarService;
import treining.factory.FiatFactory;

public class App {

    public static void main(String[] args) {

        CarService service = new CarService(new FiatFactory());
        service.execute();

    }
}
