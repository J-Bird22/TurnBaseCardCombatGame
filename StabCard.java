import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StabCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StabCard extends AttackCard
{
    //Attack Damage Of The STAB Card
    int Attack = 2;
    //Energy Cost Of The STAB Card
    int energyCost = 1;
    //
    BattleScreen world;
    //Resize The Card
    public StabCard ()
    {
        this(58, 66);
    }
    public StabCard(int width, int height)
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
        if (Greenfoot.mouseClicked(this))
        {
            if (world.energyBar.energy >= 1)
            {
                world.energyBar.decreaseEnergy(energyCost);
                getWorld().removeObject(this);
            }
        }
    }
    protected void addedToWorld​(World world)
    {
        this.world = (BattleScreen)world;
    }
}
