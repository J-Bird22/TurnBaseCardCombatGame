import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shopbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shopbutton extends Actor
{
    /**
     * Act - do whatever the Shopbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.mouseClicked(this))
            {
                getWorld().addObject(new ShopMenu(), 300, 190);
                getWorld().addObject(new Buy3(), 290, 225);
                getWorld().addObject(new Buy2(), 375, 225);
                getWorld().addObject(new Buy1(), 215, 225);
            }  
    }  
    public Shopbutton()
    {
            this(20,30); 
    }
    public Shopbutton(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height); 
        setImage(image);
    }
}
