import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buy2 extends Buy
{
    GreenfootImage image2 = new GreenfootImage("images/Bought2.png");
    int clicked = 0;
    /**
     * Act - do whatever the Buy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && clicked == 0)
       {
           setImage(image2);
           setLocation(getX(), getY() - 35);
           clicked = 1;
       }
    }
}
