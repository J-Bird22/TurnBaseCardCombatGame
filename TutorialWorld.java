import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialWorld extends World
{

    /**
     * Constructor for objects of class TutorialWorld.
     * 
     */
    public TutorialWorld()
    {     
        super(600, 400, 1); 
        for (int i = 0; i < 5; i ++) 
        {
            addObject(new Path(), 50*i + 10, 250); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path(), 50*i + 300, 250); 
        }
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Text text = new Text();
        addObject(text,214,75);
        World1test world1test = new World1test();
        addObject(world1test,255,248);

        Wizard wizard = new Wizard();
        addObject(wizard,16,253);
        Cointest cointest = new Cointest(50, 50);
        addObject(cointest,436,248);
        Wall wall = new Wall(500, 10);
        addObject(wall,240,200);
        Wall wall2 = new Wall(500, 10);
        addObject(wall2,193,500);
        wall2.setLocation(249,290);
        Wall wall3 = new Wall(10, 50);
        addObject(wall3,502,257);
        wall3.setLocation(486,247);
    }
}
