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
        Text2 text2 = new Text2();
        addObject(text2,211,330);
    }
}
