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
    int h = 0;
    int i = 0;
    int j = 0;
    int k = 0;
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
        int ownedCards = a + b + c + d + e + f + g + h + i + j + k;
        int deckAmount = ownedCards - cardsInHand - usedCards;
        //Shuffle Used Cards Back Into Deck
        if (deckAmount == 0)
        {
            //shuffle usedCards
        }
        if(Greenfoot.isKeyDown("W"))
        {
            newTurn();            
        }
    }
    //Filler Turn Code
    //(Just Put This In The Actual Turn Method)
    public void newTurn()
    {
        //Test Method For Giving Random Cards From The Deck
        //pick random number
        int[] cards = new int[] {1, 2 , 4}; // any set of values
        int choice = cards[Greenfoot.getRandomNumber(cards.length)];
        if (choice == 1)
        {
            addObject(new StabCard(), 100, 100);
        }
        if (choice == 2)
        {
            addObject(new HeavyShieldCard(), 100, 100);
        }
        if (choice == 4)
        {
            addObject(new PiercingBoltCard(), 100, 100);
        }
    }
}
//private boolean mouseOnObject(Actor actor) {
//    MouseInfo mouse = Greenfoot.getMouseInfo();
//    return mouse != null && mouse.getX() > actor.getX() - actor.getImage().getWidth()/2 && mouse.getX() < actor.getX() + actor.getImage().getWidth()/2 && 
//       mouse.getY() > actor.getY() - actor.getImage().getHeight()/2 && mouse.getY() < actor.getY() + actor.getImage().getHeight()/2;