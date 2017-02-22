
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city 
        City kw = new City();
        
        //creating a robot
        Robot carl = new Robot(kw, 0, 0, Direction.EAST);
       
        //creating a castle 
        new Wall(kw, 2, 2, Direction.WEST);        
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        
        // top left wall
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.WEST);
        
        //top right wall 
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.WEST);
        
        //Bottom right wall
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.WEST);
        
        //Bottom right wall 
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.WEST);
        
        //carl guards the castle
        
        while(true){
            carl.move();
            carl.move();
            carl.turnLeft();
            carl.turnLeft();
            carl.turnLeft();
            carl.move();
            carl.turnLeft();
            carl.move();
            carl.turnLeft();
            carl.move();
            carl.turnLeft();
            carl.turnLeft();
            carl.turnLeft();
            carl.move();
            carl.move();
            carl.turnLeft();
            carl.turnLeft();
            carl.turnLeft();
        }
        
        
        
        
        
        
                
    }
}
