/**
 * Write a description of class OrangePhantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrangePhantom extends Phantom
{
    public void act(){
        setImage("orange-phantom-left.png");
        setLocation(getX() + deltax, getY() + movementInY);
        movePhantom();
        checkCollisions();
        if(isAtEdge()){
            deltax*= -1;
        }
    }
}
