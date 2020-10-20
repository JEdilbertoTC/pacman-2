import greenfoot.*;
/**
 * Write a description of class BluePhantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BluePhantom extends Phantom
{
   
    public void act(){

        setLocation(getX() + deltax, getY() + movementInY);
        setImage("blue-phantom-left.png");
        movePhantom();
        checkCollisions();
        if(isAtEdge() || isTouching(Wall.class)){
            deltax*= -1;
            deltay*= -1;
        }
    }
    
     
}
