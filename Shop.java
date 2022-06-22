import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends World
{

    /**
     * Constructor for objects of class Shop.
     * 
     */
    public Shop()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
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
