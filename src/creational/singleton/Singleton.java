package creational.singleton;

/**
 * Created by nitish.s on 07/07/19.
 */
public class Singleton {

    private Singleton() {}

    public static final Singleton instance = new Singleton(); // Early Instantiation

    public static Singleton getInstance() {
        return instance;
    }

}
