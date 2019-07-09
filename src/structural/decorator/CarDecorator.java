package structural.decorator;

/**
 * Created by nitish.s on 07/07/19.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}
