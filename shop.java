import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shop extends World
{

    /**
     * Constructor for objects of class shop.
     * 
     */
    public shop()
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
        StoreKeeper storeKeeper = new StoreKeeper(300, 300);
        addObject(storeKeeper,251,195);

        BlackLine blackLine = new BlackLine(300, 10);
        addObject(blackLine,269,256);

        Shopbutton shopbutton = new Shopbutton(150, 150);
        addObject(shopbutton,88,100);
        shopbutton.setLocation(81,69);
    }
}
