import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        move(4);
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
            Greenfoot.playSound("slurp.wav");
            if(getWorld().getObjects(Worm.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("victory.wav");
                Greenfoot.stop();

            }
        }  
    
        if(isTouching(Lobster.class))
        {
        Greenfoot.playSound("lose.wav");
        Greenfoot.setWorld(new lose());
        }
    }
}


