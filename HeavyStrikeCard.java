import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeavyStrikeCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeavyStrikeCard extends AttackCard
{
    //Attack Damage Of The HEAVYSTRIKE Card
    int Attack = 4;
    //Energy Cost Of The HEAVYSTRIKE Card
    int energyCost = 2;
    //
    Battlescreen world;
    //Resize The Card
    public HeavyStrikeCard ()
    {
        this(60, 80);
    }
    public HeavyStrikeCard(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    /**
    /**
     * Act - do whatever the HeavyStrikeCard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Allowing The Player To Use The Card ONLY If They've 
        //Enough Energy - - - - - - - - - -
        if (Greenfoot.mouseClicked(this))
        {
            if (world.energyBar.energy >= 1)
            {
                world.energyBar.decreaseEnergy(energyCost);
                getWorld().removeObject(this);
            }
        }
    }
    //Makes The HeavyStrikeCard Able To Use The BattleScreen Class
    //Allowing The Actors To Use The 'healthBar' and 'energyBar'
    protected void addedToWorld(World world)
    {
        this.world = (Battlescreen)world;
    }
}
