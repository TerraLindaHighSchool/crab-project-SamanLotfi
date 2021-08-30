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
    private boolean turnAtEdge()
    {
        if(false)
        {
            turn(-50);
        }
    }
    private void checkKeyPress()
    {
        
    }
    private void onCollision()
    {
        
    }
}


