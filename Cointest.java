import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cointest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cointest extends Actor
{
    /**
     * Act - do whatever the Cointest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }
    public Cointest()
    {
            this(20,30); 
    }
    public Cointest(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height); 
        setImage(image);
    }
}
