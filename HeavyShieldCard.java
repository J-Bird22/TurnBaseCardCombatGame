import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeavyShieldCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeavyShieldCard extends BlockCard
{
    //Shield Amount Of The HEAVYSHIELD Card
    int Block = 6;
    //Energy Cost Of The HEAVYSHIELD Card
    int energyCost = 2;
    Battlescreen world;
    //Resize The Card
    public HeavyShieldCard ()
    {
        this(40, 62);
    }
    public HeavyShieldCard(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    /**
     * Act - do whatever the StabCard wants to do. This method is called whenever
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
    //Makes The ShieldCard Able To Use The BattleScreen Class
    //Allowing The Actors To Use The 'healthBar' and 'energyBar'
    protected void addedToWorld(World world)
    {
        this.world = (Battlescreen)world;
    }
}
