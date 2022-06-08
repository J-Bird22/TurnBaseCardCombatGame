import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleScreen extends World
{
    //Allows Energy Bar To Be Used In Other Actors
    Energy energyBar;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BattleScreen()
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
        Deck deck = new Deck();
        addObject(deck,233,365);
        StabCard stabCard = new StabCard();
        addObject(stabCard,27,365);
        energyBar = new Energy();
        addObject(energyBar,570,370);
        deck.setLocation(234,365);
        HeavyShieldCard heavyShieldCard = new HeavyShieldCard(58, 66);
        addObject(heavyShieldCard,78,368);
    
    }
}
