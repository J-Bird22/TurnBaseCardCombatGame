import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class PlayerTypeOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    //the player max hp
    int maxhpP = 15;
    
    //the player max mp (MP = Energy)
    int maxmp = 3;
    
    //player healed dmg
    int heal; 
    
    //dmg to player hp
    int dmghP;
    
    //dmg to player mp (MP = Energy)
    int dmgm;
    
    //block dmg
    int block;
    
    //player hp
    int hp = maxhpP;
    
    //player mp
    int mp = maxmp - dmgm;
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
        if (wait = true)
        {
           dmg();
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
    
    public void dmg()
    {
       //use enemy class variables to adjust player stats
       
       //dmg;
       //int spedmg = world.dmg.enemy + world.spec.enemy;
       //action;
       //cldwn
       
       //if enemy attacks, take dmg according to dmg value
       
       
       //if (world.action.enemy == 0)
       {
       //   hp = hp - (world.dmg.enemy/2);
       }
       //else if (world.action.enemy == 2 && world.cldwn.enemy > 3)
       {
       //   hp = hp - (spedmg/2);
       }
       //else if (world.action.enemy == 2)
       {
       //   hp = hp - (world.dmg.enemy/2);
       }
       //else if (world.action.enemy == 1)
       {
       //   hp = hp;
       }
    }
}