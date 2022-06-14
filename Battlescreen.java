import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battlescreen extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Battlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Enemy enemy = new Enemy();
        addObject(enemy,150,200);
        TurnUnblocker turnUnblocker = new TurnUnblocker();
        addObject(turnUnblocker,450,200);
        PlayerTypeOne playerTypeOne = new PlayerTypeOne();
        addObject(playerTypeOne,450,200);
    }
}