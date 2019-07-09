package behavioral.template;

/**
 * Created by nitish.s on 09/07/19.
 */

/**
 *  Suppose we want to provide an algorithm to build a house.
 *  The steps need to be performed to build a house are – building foundation, building pillars, building walls and windows.
 *  The important point is that the we can’t change the order of execution because we can’t build windows before building the foundation.
 */

public class Client {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
