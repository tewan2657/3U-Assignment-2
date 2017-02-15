
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city    
        City kw = new City();

        //create a robot
        Robot carl = new Robot(kw, 1, 1, Direction.EAST);

        //place 10 thing in a row
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);


        // command robot to pick up only 7 out 10 things 
        //loop
        while (true) {
            carl.move();
            // if there are things, pick them all up 
            while (carl.canPickThing()) {
                carl.pickThing();
            }
            // if holding 7 things, stop picking up things
            if (carl.countThingsInBackpack() == 7) {
                break;
                } 

        } // carl moves
        carl.move();
        carl.move();
        carl.move();
        carl.move();













    }
}
