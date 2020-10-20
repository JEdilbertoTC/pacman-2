
import greenfoot.*;
/**
 * Write a description of class Phantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phantom extends Person 
{
    protected int deltax = 1;
    protected int deltay = 1;
    protected int movementInY;
    protected int movementInX;
    private PhantomState phantomState;
    
    public Phantom()
    {

        phantomState = PhantomState.NORMAL;
        direction = CharacterDirection.RIGHT;
    }
    
    public void act(){
        

    }
    protected void movePhantom()
    {
        movementInY = 0;
        movementInX = 0;

        switch(direction)
        {
            case UP:
            direction = CharacterDirection.UP;
            movementInY = -1;
            turnTowards(getX(), 0); 
            break;
            case DOWN:
            direction = CharacterDirection.DOWN;
             
            movementInY = 1;
            turnTowards(getX(), getWorld().getHeight()); 
            break;
            case LEFT:
            direction = CharacterDirection.LEFT;
            turnTowards(0, getY());
            movementInX = -1;
          
            break;
            case RIGHT:
            direction = CharacterDirection.RIGHT;
            
             turnTowards(getWorld().getWidth(), getY());
            movementInX = 1;
          
            break;
        }
    }  
    
   void checkCollisions()
    {
        Wall wall = null;
        
        switch(direction)
        {
            case UP:
            wall = (Wall)getOneObjectAtOffset(0, -20, Wall.class);
            
            break;
            case DOWN:
            wall = (Wall)getOneObjectAtOffset(0, 20, Wall.class);
            
            break;
            case RIGHT:
            wall = (Wall)getOneObjectAtOffset(20, 0, Wall.class);
            
            break;
            case LEFT:
            wall = (Wall)getOneObjectAtOffset(-20, 0, Wall.class);
             
            break;
        }

        if(wall != null || isAtEdge())
        {
            movementInY = 0;
            movementInX = 0;
        }
    }
        
   
}
