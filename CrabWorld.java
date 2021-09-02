import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,370,188);
        Worm worm = new Worm();
        addObject(worm,208,277);
        Worm worm2 = new Worm();
        addObject(worm2,350,85);
        Worm worm3 = new Worm();
        addObject(worm3,171,122);
        Worm worm4 = new Worm();
        addObject(worm4,377,372);
        Worm worm5 = new Worm();
        addObject(worm5,46,451);
        Worm worm6 = new Worm();
        addObject(worm6,100,229);
        Worm worm7 = new Worm();
        addObject(worm7,511,67);
        Worm worm8 = new Worm();
        addObject(worm8,214,430);
        Worm worm9 = new Worm();
        addObject(worm9,499,259);
        Worm worm10 = new Worm();
        addObject(worm10,68,47);
        Worm worm11 = new Worm();
        addObject(worm11,458,499);
        Worm worm12 = new Worm();
        addObject(worm12,340,277);
        Worm worm13 = new Worm();
        addObject(worm13,291,504);
        Worm worm14 = new Worm();
        addObject(worm14,70,339);
        Lobster lobster = new Lobster();
        addObject(lobster,94,137);
        removeObject(worm5);
        removeObject(worm10);
        removeObject(worm13);
        removeObject(worm11);
        removeObject(worm7);
    }
}