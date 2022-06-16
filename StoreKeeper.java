import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoreKeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoreKeeper extends Actor
{
    /**
     * Act - do whatever the StoreKeeper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation (getX(), getY() -10);
        Greenfoot.delay(8);
         setLocation (getX(), getY() +10);
        Greenfoot.delay(8);
    } 
     public StoreKeeper()
    {
            this(20,30); 
    }
    public StoreKeeper(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height); 
        setImage(image);
    }
}