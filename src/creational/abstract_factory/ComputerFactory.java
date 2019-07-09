package creational.abstract_factory;

/**
 * Created by nitish.s on 07/07/19.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}