import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }
    public Coin()
    {
            this(20,30); 
    }
    public Coin(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height); 
        setImage(image);
    }
}
