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
    int delay = 0;
    //Create The Images Showing How Much Energy The Player Has
    GreenfootImage image0 = new GreenfootImage("images/Energy0.png");
    GreenfootImage image31 = new GreenfootImage("images/Energy3-1.png");
    GreenfootImage image32 = new GreenfootImage("images/Energy3-2.png");
    GreenfootImage image33 = new GreenfootImage("images/Energy3-3.png");
    GreenfootImage image34 = new GreenfootImage("images/Energy3-4.png");
    GreenfootImage image21 = new GreenfootImage("images/Energy2-1.png");
    GreenfootImage image22 = new GreenfootImage("images/Energy2-2.png");
    GreenfootImage image23 = new GreenfootImage("images/Energy2-3.png");
    GreenfootImage image24 = new GreenfootImage("images/Energy2-4.png"); 
    GreenfootImage image11 = new GreenfootImage("images/Energy1-1.png");
    GreenfootImage image12 = new GreenfootImage("images/Energy1-2.png");
    GreenfootImage image13 = new GreenfootImage("images/Energy1-3.png");
    GreenfootImage image14 = new GreenfootImage("images/Energy1-4.png"); 
    //
    public int level()
    {
        return energy;
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
            if (delay == 20)
            {
                setImage(image31);
            }
            if (delay == 40)
            {
                setImage(image32);
            }
            if (delay == 60)
            {
                setImage(image33);
            }
            if (delay >= 80)
            {
                setImage(image34);
                delay = 0;
            }
            delay++;
        }
        else 
        if (energy == 2)
        {
            if (delay == 20)
            {
                setImage(image21);
            }
            if (delay == 40)
            {
                setImage(image22);
            }
            if (delay == 60)
            {
                setImage(image23);
            }
            if (delay >= 80)
            {
                setImage(image24);
                delay = 0;
            }
            delay++;
        }
        else 
        if (energy == 1)
        {
            if (delay == 20)
            {
                setImage(image11);
            }
            if (delay == 40)
            {
                setImage(image12);
            }
            if (delay == 60)
            {
                setImage(image13);
            }
            if (delay >= 80)
            {
                setImage(image14);
                delay = 0;
            }
            delay++;
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
