import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(640, 640, 1);
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
        crab.setLocation(572,329);
        lobster.setLocation(332,333);
        worm2.setLocation(346,127);
        worm.setLocation(708,468);
        worm9.setLocation(830,417);
        lobster.setLocation(745,368);
        worm9.setLocation(734,384);
        worm.setLocation(576,516);
        worm9.setLocation(791,214);
        worm9.setLocation(860,421);
        worm.setLocation(631,608);
        worm4.setLocation(380,510);
        worm8.setLocation(148,589);
        worm14.setLocation(120,364);
        worm8.setLocation(116,624);
        worm4.setLocation(372,551);
        worm12.setLocation(327,363);
        worm3.setLocation(596,80);
        worm6.setLocation(151,85);
        lobster.setLocation(895,80);
        crab.setLocation(584,364);
        Worm worm15 = new Worm();
        addObject(worm15,204,220);
        Worm worm16 = new Worm();
        addObject(worm16,475,219);
        Worm worm17 = new Worm();
        addObject(worm17,210,492);
        Worm worm18 = new Worm();
        addObject(worm18,862,641);
        Worm worm19 = new Worm();
        addObject(worm19,747,201);
        Worm worm20 = new Worm();
        addObject(worm20,420,702);
        worm6.setLocation(93,68);
        lobster.setLocation(499,70);
        worm.setLocation(567,544);
        crab.setLocation(224,346);
        lobster.setLocation(493,83);
        worm3.setLocation(591,71);
        worm2.setLocation(304,76);
        worm15.setLocation(200,184);
        worm14.setLocation(67,270);
        worm17.setLocation(87,485);
        worm8.setLocation(56,632);
        worm17.setLocation(91,461);
        worm4.setLocation(193,589);
        worm20.setLocation(347,508);
        worm.setLocation(519,578);
        worm18.setLocation(473,404);
        worm16.setLocation(342,197);
        worm3.setLocation(458,270);
        worm9.setLocation(577,341);
        worm19.setLocation(569,130);
        worm4.setLocation(230,480);
        worm8.setLocation(85,576);
        removeObject(worm4);
        removeObject(worm17);
        removeObject(worm15);
        removeObject(worm12);
        worm9.setLocation(108,455);
        crab.setLocation(258,357);
        worm3.setLocation(537,294);
        worm16.setLocation(399,214);
        worm20.setLocation(236,554);
        worm18.setLocation(441,446);
        worm20.setLocation(342,582);
    }
}