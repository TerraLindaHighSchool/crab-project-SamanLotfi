import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision(); 
    }
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
    }
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
        }  
    }
}


