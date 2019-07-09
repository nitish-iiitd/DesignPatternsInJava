package structural.decorator;

/**
 * Created by nitish.s on 07/07/19.
 */
public class Client {
    public static void main(String[] args) {

        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("\n============================");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
