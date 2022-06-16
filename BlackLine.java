import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blackLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackLine extends Actor
{
    /**
     * Act - do whatever the blackLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }
    public BlackLine()
    {
            this(20,30); 
    }
    public BlackLine(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height); 
        setImage(image);
    }
}



