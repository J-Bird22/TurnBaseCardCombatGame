import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wizzard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wizard extends Actor
{
    /**
     * Act - do whatever the wizzard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      Text text = new Text();  
      if (isTouching(Path.class)) 
        {
            move(30);
            Greenfoot.delay(10); 
        }
      if (isTouching(EndPath1.class))
        { 
          getWorld().addObject( new Text(), 200, 200);  
        }
     }
}
