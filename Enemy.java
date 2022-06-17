import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    //take variables typeH, typeD and typeS for hp, dmg, and spec attack values
    

    //DISCLAIMER, THIS IS JUST ONE ENEMY TYPE RIGHT NOW, STATS AREN'T BASED OFF OF CLASS YET
    

    
    
    //not sure if this is even gonna be implimented, cool idea though (1 for now cuz can't be 0)
    int level = 1; //this can probably be based on what level of the world the player is on
    
    //chooses type of enemy at random
    int choose = Greenfoot.getRandomNumber(3);
    
    //enemy's defence
    int def;
    
    //what enemy does as a spec attack
    int spec;
    
    //how much dmg the enemy has taken
    int dmgh;
    
    //how much dmg the enemy deals
    int dmg;
    
    //enemy max hp, (yeah armor goes over the max cuz its not hp)
    int maxhp;
    
    // armor value the enemy gains by defending, (temporary hp)
    int armor = maxhp/4;
    
    //enemy current hp
    int hp = maxhp - dmgh;
    
    //what the enemy is doing on their turn
    int action = Greenfoot.getRandomNumber(3);
    
    //stops stuff
    int stopE;
    
    //enemy cooldown between spec attacks
    int cldwn = 0;
    
    //if the enemy is waiting for player to take their turn
    boolean sit = true;
    
    /**
     * Act - do whatever the Rat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        enemytype();
        if (stopE ==  0)
        {
           System.out.println("Enemy max HP: " + maxhp);
           System.out.println("Enemy hp: " + hp);
           System.out.println("Enemy dmg: " + dmg);
           System.out.println("Enemy def: " + def);
           stopE ++;
        }
        
        //determines if its the enemy's turn
        if (isTouching(TurnUnblocker.class))
        {
           sit = false;
        }
        
        //if its the enemy's turn, they take thier turn
        if (sit == false)
        {
           Greenfoot.delay(100);
           turn();
        }
    }    
    
    public void turn()
    {
       //turn actions based on rng
       if (action == 0)
       {
          //attack (typeD in dmg)
          System.out.println("enemy: attack");
          cldwn ++;
       }
       else if (action == 1)
       {
          //defend
          System.out.println("Enemy hp:"+ hp);
          hp = hp + armor;
          System.out.println("Enemy hp:"+ hp);
          cldwn ++;
       }
       else if (action == 2 && cldwn > 3)
       {
          //spec attack (TypeS in Attack type)
          System.out.println("enemy: spec attack");
          cldwn = 0;    
       }
       else if (action == 2)
       {
          //attack (typeD in dmg)
          System.out.println("enemy: attack");
          cldwn ++;
       }
       
       //ends enemy turn and starts player turn
       Actor turnUnblocker = getOneIntersectingObject(TurnUnblocker.class);
       
       if (turnUnblocker != null)
       {
          System.out.println("enemy ended turn");
          getWorld().removeObject(turnUnblocker);
          getWorld().addObject(turnUnblocker, 450,200);
       }
       
       //double check turn has ended
       sit = true;
       
       //re-select action for next turn
       action = Greenfoot.getRandomNumber(3);

       System.out.println("cooldown: " + cldwn);
       if (action == 0)
       {
          System.out.println("enemy next action: Basic Attack");
       }
       else if (action == 1)
       {
          System.out.println("enemy next action: Block");
       }
       else if (action ==  2 && cldwn > 3)
       {
          System.out.println("enemy next action: special attack!");
       }
       else if (action == 2)
       {
          System.out.println("enemy next action: Basic Attack");
       }

       System.out.println("enemy next action: " + action);

    }   
    
    public void enemytype()
    {
       if (choose == 0)
       {
          //rat
          maxhp = 9;
          hp = 9;
          dmg = 2;
          def = 0;
          spec = 1 + Greenfoot.getRandomNumber(1);
       }
       else if (choose == 1)
       {
          //slime
          maxhp = 6;
          hp = 6;
          dmg = 2;
          def = 1;
          spec = 3;
       }
       else if (choose == 2)
       {
          //goblin
          maxhp = 5;
          hp = 5;
          dmg = 3;
          def = 1;
          spec = 2;
       }
    }
}