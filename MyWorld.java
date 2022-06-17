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
        super(900, 625, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        for (int i = 0; i < 5; i ++) 
        {
            addObject(new Path(), 50*i + 10, 500); 
        }
        for (int i = 0; i < 2; i ++) 
        {
            addObject(new Path(), 50*i + 370, 500); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path2(),475 , 50*i + 392); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path2(),325, 50*i + 300); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path(), 50*i + 360, 360); 
        }
        addObject( new EndPath1(), 260, 500); 
        addObject( new World1(), 325, 450); 
        World1 world12 = new World1();
        addObject(world12,325,500);
        World1 world13 = new World1();
        addObject(world13,325,550);
        Wizard wizard = new Wizard();
        addObject(wizard,20,502);
        Wall wall = new Wall(300, 10);
        addObject(wall,120,460);
        Wall wall2 = new Wall(300, 10);
        addObject(wall2,120,540);
        
    }
}
