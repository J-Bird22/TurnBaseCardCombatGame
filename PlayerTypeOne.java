import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class PlayerTypeOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTypeOne extends Player
{
    //the player max hp
    int maxhp = 15;
    
    //the player max mp (MP = Energy)
    int maxmp = 3;
    
    //player healed dmg
    int heal; 
    
    //dmg to player hp
    int dmgh;
    
    //dmg to player mp (MP = Energy)
    int dmgmp;
    
    //player hp
    int hp = maxhp - dmgh + heal;
    
    //player mp
    int mp = maxmp - dmgmp;
    //mp regained at end of turn
    
    //stops stuff
    int stopP;
    
    boolean wait = false;
    //if its the player's turn or not, false is player's turn
    
    /**
     * Act - do whatever the PlayerTypeOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(TurnUnblocker.class))
        {
           wait = false;
        }
        if (wait == false)
        {
           turn();
        }
    }    
    
    public void turn()
    {
       if (stopP ==  0)
       {
          System.out.println("its your turn");
          stopP ++;
       }
       
       setLocation(450,200);
       //(cards stuff)
       
       //cards show up
       
       //take your turn
       
       
       //ends turn
       if (wait == false && Greenfoot.isKeyDown("e"))
       {
          System.out.println("ended player turn");
          
          //stops the stop variable
          stopP = 0;
          
          //ends player turn
          Actor turnUnblocker = getOneIntersectingObject(TurnUnblocker.class);
       
          if (turnUnblocker != null)
          {
             getWorld().removeObject(turnUnblocker);
             getWorld().addObject(turnUnblocker, 150,200);
          }
       }
    }
    
    public void animate()
    {
       //animation stuff
    }
}