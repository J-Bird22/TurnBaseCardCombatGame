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
    //Card Variables 
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BattleScreen()
    {    
        // World 
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //AddObjects
        Deck deck = new Deck();
        addObject(deck,233,365);
        StabCard stabCard = new StabCard();
        addObject(stabCard,27,365);
        energyBar = new Energy();
        addObject(energyBar,570,370);
        deck.setLocation(234,365);
        HeavyShieldCard heavyShieldCard = new HeavyShieldCard(40, 62);
        addObject(heavyShieldCard,79,365);
    }
    public void act()
    {
        //Temporary Way For "New Turn"
        if (Greenfoot.isKeyDown("Space"))
        {
            newTurn();
            Greenfoot.delay(30);
        }
        //Variable For The Cards Locations
        int cardsInHand = 4;
        int usedCards = 0;
        int ownedCards = OwnedCards();
        int deckAmount = ownedCards - cardsInHand - usedCards;
        //Shuffle Used Cards Back Into Deck
        if (deckAmount == 0)
        {
            //shuffle usedCards
        }
    }
    public void newTurn()
    {
        //Test Method For Giving Random Cards From The Deck
        for (int i = 0; i < 3; i++)
        {
            int card = Greenfoot.getRandomNumber(2);
            if (card == 1)
            {
            addObject(new StabCard(), 50, 50);
            }
            else addObject(new HeavyShieldCard(), 50, 50);
        }
        
    }
    public void OwnedCards()
    {
        //Method For Counting The Type And Amount Of Cards
        
        int Amt = a + b;
        
    }
}
//private boolean mouseOnObject(Actor actor) {
//    MouseInfo mouse = Greenfoot.getMouseInfo();
//    return mouse != null && mouse.getX() > actor.getX() - actor.getImage().getWidth()/2 && mouse.getX() < actor.getX() + actor.getImage().getWidth()/2 && 
//       mouse.getY() > actor.getY() - actor.getImage().getHeight()/2 && mouse.getY() < actor.getY() + actor.getImage().getHeight()/2;