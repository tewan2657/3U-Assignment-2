
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a city 
        City kw = new City();

        //creating a robot 
        Robot carl = new Robot(kw, 9, 19, Direction.WEST);

        while (true) {

            if (carl.getStreet() == 0) {
                break;
            }


            carl.move();
            if (carl.getAvenue() == 1) {
                carl.turnLeft();
                carl.turnLeft();
                carl.turnLeft();
                carl.move();
                carl.turnLeft();
                carl.move();
                carl.turnLeft();
                carl.turnLeft();
                carl.turnLeft();






            }
        }
    }
}
