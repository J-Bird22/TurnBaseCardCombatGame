import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Path path = new Path();
        addObject(path,38,232);
        Path path2 = new Path();
        addObject(path2,145,232);
        Path path3 = new Path();
        addObject(path3,258,231);
        Path2 path22 = new Path2();
        addObject(path22,328,218);
        Path2 path23 = new Path2();
        addObject(path23,328,141);
        world1 world1 = new world1();
        addObject(world1,329,47);
        path22.setLocation(329,226);
        wizzard wizzard = new wizzard();
        addObject(wizzard,28,230);
    }
}
