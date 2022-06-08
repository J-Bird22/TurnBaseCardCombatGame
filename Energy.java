import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Energy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Energy extends Actor

{   
    //EnergyINT
    int Energy = 3;
    //Resize to make it fit on screen
    public Energy ()
    {
        this(100, 40);
    }
    public Energy(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    /**
     * Act - do whatever the Energy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Basic Change IMG Depedning On Amount Of "Energy"
        if (Energy == 3)
        {
            
        }
        else 
        if (Energy == 2)
        {
            
        }
        else 
        if (Energy == 1)
        {
            
        }
    }
}
