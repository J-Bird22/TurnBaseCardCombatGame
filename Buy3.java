import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buy3 extends Buy
{
    GreenfootImage image3 = new GreenfootImage("images/Bought3.png");
    int clicked = 0;
    /**
     * Act - do whatever the Buy3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && clicked == 0)
       {
           setImage(image3);
           setLocation(getX(), getY() - 35);
           clicked = 1;
       }
    }
}
