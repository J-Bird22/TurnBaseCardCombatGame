import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceBallCard extends MagicCard
{
    //Attack Damage Of The FIREBALL Card
    int attack = 5;
    //Energy Cost Of The FIREBALL Card
    int energyCost = 3;
    Battlescreen world;
    //Resize The Card
    public IceBallCard ()
    {
        this(60, 80);
    }
    public IceBallCard(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    /**
     * Act - do whatever the FireBall wants to do. This method is called whenever
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
    //Makes The IceBallCard Able To Use The BattleScreen Class
    //Allowing The Actors To Use The 'healthBar' and 'energyBar'
    protected void addedToWorld(World world)
    {
        this.world = (Battlescreen)world;
    }
}
