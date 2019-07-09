package behavioral.state;

/**
 * Created by nitish.s on 09/07/19.
 */
public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }

}
