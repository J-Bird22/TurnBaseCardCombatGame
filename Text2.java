import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text2 extends Actor
{
    /**
     * Act - do whatever the Text2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Greenfoot.delay(300);
        getWorld().removeObject(this);
    }    
}
