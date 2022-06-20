import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
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
    int armor;
    
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
    
    //determines if the enemy is a bossfight or not (will be based off of another variable later)
    int boss = 0;
    /** - Jesse
     * The Images Below I Changed Since Somewhere We Lost The Placeholder Images
     * And Im Not Sure If They Need  A Specefic Look But I Gave Them An Image To Run
     */
    //image stuff
    GreenfootImage placeholder;
    GreenfootImage placehold;
    GreenfootImage holdplace;
    {
       placeholder = new GreenfootImage("images/Filler1.png");
       placehold = new GreenfootImage("images/Filler2.png");
       holdplace = new GreenfootImage("images/Filler3.png");
    }
    
    /**
     * Act - do whatever the Rat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        if (stopE ==  0)
        {
           enemytype();
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
        
        //if its the enemy's turn, they take thier turn (with delay for player's sake)
        if (sit == false)
        {
           Greenfoot.delay(100);
           turn();
        }
    }    
    
    public void turn()
    {
       //turn actions based on rng 66% attack chance, 33% defend chance
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
    }   
    
    public void enemytype()
    {
       //this is just used to create more enemies, 3 bosses and normal enemies have been created so far
       if (boss == 1 && choose == 0)
       {
          //dragon
          maxhp = 50;
          hp = 50;
          dmg = 7;
          def = 3;
          armor = 4;
          spec = 2 + Greenfoot.getRandomNumber(4);
       }
       else if (boss == 1 && choose == 1)
       {
          //beholder
          maxhp = 30;
          hp = 30;
          dmg = 5;
          def = 2;
          armor = 6;
          spec = Greenfoot.getRandomNumber(9);
       }
       else if (boss == 1 && choose == 2)
       {
          //catapult or something
          maxhp = 70;
          hp = 70;
          dmg = 6;
          def = 0;
          armor = 2;
          spec = 2;
       }
        else if (choose == 0)
       {
          //rat
          setImage(placehold); //placeholder image for enemy type
          maxhp = 9;
          hp = 9;
          dmg = 2;
          def = 0;
          armor = 3;
          spec = 1 + Greenfoot.getRandomNumber(1);
       }
       else if (choose == 1)
       {
          //slime
          setImage(holdplace); //placeholder image for enemy type
          maxhp = 6;
          hp = 6;
          dmg = 1;
          def = 1;
          armor = 2;
          spec = 3;
       }
       else if (choose == 2)
       {
          //goblin
          setImage(placeholder); //placeholder image for enemy type
          maxhp = 5;
          hp = 5;
          dmg = 3;
          def = 1;
          armor = 1;
          spec = 2;
       }
    }
    
    public void takedmg()
    {
       //get enemy class to use its variables to adjust player stats
       Class Player = getClass();
       
       int eAtkp;//= carddmg;
       
       
       //if player uses card, take dmg based on card dmg value
       //if (Player uses card)
       //{
       //   dmgh + carddmg
       //}
    }
}
