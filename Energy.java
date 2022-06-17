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
    public int energy = 3;
    //Create The Images Showing How Much Energy The Player Has
    GreenfootImage image0 = new GreenfootImage("C:/Users/moorej/Documents/GitHub/TurnBaseCardCombatGame/images/Energy 0.png");
    GreenfootImage image1 = new GreenfootImage("C:/Users/moorej/Documents/GitHub/TurnBaseCardCombatGame/images/Energy 1.png");
    GreenfootImage image2 = new GreenfootImage("C:/Users/moorej/Documents/GitHub/TurnBaseCardCombatGame/images/Energy 2.png");
    GreenfootImage image3 = new GreenfootImage("C:/Users/moorej/Documents/GitHub/TurnBaseCardCombatGame/images/Energy 3.png");
    //
    public int level()
    {
        return energy;
    }
    //Resize The Energy Image
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
        if (energy == 3)
        {
            setImage(image3);
        }
        else 
        if (energy == 2)
        {
            setImage(image2);
        }
        else 
        if (energy == 1)
        {
            setImage(image1);
        }
        else 
        if (energy == 0)
        {
            setImage(image0);
        }
    }
    //Method For Card Actors To Decrease The Energy
    public void decreaseEnergy(int amount)
    {
        energy = energy - amount;
    }
}
