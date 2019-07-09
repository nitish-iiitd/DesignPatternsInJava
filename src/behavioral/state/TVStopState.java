package behavioral.state;

/**
 * Created by nitish.s on 09/07/19.
 */
public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }

}