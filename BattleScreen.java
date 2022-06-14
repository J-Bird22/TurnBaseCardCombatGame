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
    int a = 3;
    int b = 1;
    int c = 1;
    int d = 1;
    int e = 2;
    int f = 1;
    int g = 0;
    int h = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    int m = 0;
    int a1 = 3;
    int b1 = 1;
    int c1 = 1;
    int d1 = 1;
    int e1 = 2;
    int f1 = 1;
    int g1 = 0;
    int h1 = 0;
    int i1 = 0;
    int j1 = 0;
    int k1 = 0;
    int l1 = 0;
    int m1 = 0;
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
        int cardsInHand = 0;
        int usedCards = 0;
        int ownedCards = a + b + c + d + e + f + g + h + i + j + k + l + m;
        int deckAmount = ownedCards - cardsInHand - usedCards;
        //Shuffle Used Cards Back Into Deck
        if (deckAmount == 0)
        {
            a = a1;
            b = b1;
            c = c1;
            d = d1;
            e = e1;
            f = f1;
        }
        if(Greenfoot.isKeyDown("W"))
        {
            newTurn(); 
            Greenfoot.delay(10);
        }
        for (int i = 0; i <= ownedCards; i++)
        {
            
        }
        showText("a =" + a, 50, 50);
        showText("b =" + b, 50, 70);
        showText("c =" + c, 50, 90);
        showText("d =" + d, 50,110);
        showText("e =" + e, 50, 130);
        showText("f =" + f, 50, 150);
        showText("DeckAmount =" + deckAmount, 50, 170);
    }
    //Filler Turn Code
    //(Just Put This In The Actual Turn Method)
    public void newTurn()
    {
        //Test Method For Giving Random Cards From The Deck
        //pick random number
        int[] cards = new int[] {1,2,3,4,5,6}; // any set of values
        int choice = cards[Greenfoot.getRandomNumber(cards.length)];
        if (choice == 1)
        {
            if (a > 0)
            {
                addObject(new StabCard(), 200, 200);
                a--;  
            }
            else newTurn();
        }
        if (choice == 2)
        {
            if (b > 0)
            {
                addObject(new HeavyShieldCard(), 200, 200);
                b--;
            }
            else newTurn();
        }
        if (choice == 3)
        {
            if (c > 0)
            {
                addObject(new PiercingBoltCard(), 200, 200);
                c--;
            }
            else newTurn();
        }
        if (choice == 4)
        {
            if (d > 0)
            {
                addObject(new HeavyStrikeCard(), 200, 200);
                d--;
            }
            else newTurn();
        }
        if (choice == 5)
        {
            if (e > 0)
            {
                addObject(new FastBlockCard(), 200, 200);
                e--;
            }
            else newTurn();
        }
        if (choice == 6)
        {
            if (f > 0)
            {
                addObject(new FireBallCard(), 200, 200);
                f--;
            }
            else newTurn();
        }
    }
}
//private boolean mouseOnObject(Actor actor) {
//    MouseInfo mouse = Greenfoot.getMouseInfo();
//    return mouse != null && mouse.getX() > actor.getX() - actor.getImage().getWidth()/2 && mouse.getX() < actor.getX() + actor.getImage().getWidth()/2 && 
//       mouse.getY() > actor.getY() - actor.getImage().getHeight()/2 && mouse.getY() < actor.getY() + actor.getImage().getHeight()/2;