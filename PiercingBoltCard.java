import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PiercingBoltCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PiercingBoltCard extends MagicCard
{
    //Attack Damage Of The PIERCINGBOLT Card
    int attack = 4;
    //Energy Cost Of The PIERCINGBOLT Card
    int energyCost = 1;
    Battlescreen world;
    //Resize The Card
    public PiercingBoltCard ()
    {
        this(60, 80);
    }
    public PiercingBoltCard(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    /**
     * Act - do whatever the PiercingBoltCard wants to do. This method is called whenever
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
    //Makes The PiercingBoltCard Able To Use The BattleScreen Class
    //Allowing The Actors To Use The 'healthBar' and 'energyBar'
    protected void addedToWorld(World world)
    {
        this.world = (Battlescreen)world;
    }
}
