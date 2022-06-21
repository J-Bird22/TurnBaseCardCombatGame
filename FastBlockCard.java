import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FastBlockCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FastBlockCard extends BlockCard
{
    //Shield Amount Of The FASTBLOCK Card
    int Block = 2;
    //Energy Cost Of The FASTBLOCK Card
    int energyCost = 1;
    Battlescreen world;
    //Resize The Card
    public FastBlockCard ()
    {
        this(40, 62);
    }
    public FastBlockCard(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    /**
     * Act - do whatever the FastBlockCard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Allowing The Player To Use The Card ONLY If They've 
        //Enough Energy 
        if (Greenfoot.mouseClicked(this))
        {
            if (world.energyBar.energy >= energyCost)
            {
                world.energyBar.decreaseEnergy(energyCost);
                getWorld().removeObject(this);
            }
        }
    }
    //Makes The FastBlockCard Able To Use The BattleScreen Class
    //Allowing The Actors To Use The 'healthBar' and 'energyBar'
    protected void addedToWorld​(World world)
    {
        this.world = (Battlescreen)world;
    }
}
