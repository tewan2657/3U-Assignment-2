
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city 
        City kw = new City();
        //creating a robot
        Robot carl = new Robot(kw, 5, 1, Direction.EAST);
        
        //Track  
        new Wall(kw, 5, 1, Direction.SOUTH);        
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 6, Direction.SOUTH);
        new Wall(kw, 5, 7, Direction.SOUTH);
        new Wall(kw, 5, 8, Direction.SOUTH);       
        new Wall(kw, 5, 9, Direction.SOUTH);
        
       // Hurdles 
        new Wall(kw, 5, 1, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);       
        new Wall(kw, 5, 4, Direction.EAST);
        new Wall(kw, 5, 7, Direction.EAST);
        
        //finish line 
        new Thing(kw, 5, 9);
        
        //what to do when front is not clear 
        while(true){
        if(carl.frontIsClear()==false)
        carl.turnLeft();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        break; 
        
        while(true){
          
        
        

        
       
       
        
        
        

        

        



        

        
        
        
        
        
        
        
        
    
  }
    
}
}
}





    

