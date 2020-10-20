/**
 * Write a description of class RedPhantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedPhantom extends Phantom
{
    public void act(){
        setImage("red-phantom-left.png");
        setLocation(getX() + deltax, getY() + movementInY);
        
        movePhantom();
        checkCollisions(); 
        if(isAtEdge()|| isTouching(Wall.class)){
            deltax*= -1;
        }
    }
}
