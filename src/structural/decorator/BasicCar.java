package structural.decorator;

/**
 * Created by nitish.s on 07/07/19.
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}