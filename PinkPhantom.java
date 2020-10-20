/**
 * Write a description of class PinkPhantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkPhantom extends Phantom
{
    public void act(){
        setImage("pink-phantom-left.png");
        setLocation(getX() + deltax, getY()+ movementInY);
        
        movePhantom();
        checkCollisions();
        if(isAtEdge()|| isTouching(Wall.class)){
            deltax*= -1;
        }
    }
}
