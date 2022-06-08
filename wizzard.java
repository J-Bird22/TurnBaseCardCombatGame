import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wizzard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wizzard extends Actor
{
    /**
     * Act - do whatever the wizzard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Path2.class)) 
        {
            if (Greenfoot.mouseClicked(this))
            {
                setLocation(getX(), getY() -100);        
            }
        }
        if (isTouching(Path.class)) 
        {
            if (Greenfoot.mouseClicked(this))
            {
                setLocation(getX() +100, getY());        
            }
        }
         if (isTouching(world1.class))
        {
            Greenfoot.setWorld(new BattleScreen());       
        }
    }
}
