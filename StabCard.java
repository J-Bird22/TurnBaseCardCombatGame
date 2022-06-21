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
    Battlescreen world;
    //Resize The Card
    public StabCard ()
    {
        this(40, 62);
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
        //Enough Energy 
        //
        //Code Below This Requires Something That Has Yet To Be Merged
        //
        //if (Greenfoot.mouseClicked(this))
        //{
        //    if (world.energyBar.energy >= 1)
        //    {
        //        world.energyBar.decreaseEnergy(energyCost);
        //        getWorld().removeObject(this);
        //    }
        //}

    }
    //Makes The StabCard Able To Use The BattleScreen Class
    //Allowing The Actors To Use The 'healthBar' and 'energyBar'
    protected void addedToWorld​(World world)
    {
        this.world = (Battlescreen)world;
    }
}