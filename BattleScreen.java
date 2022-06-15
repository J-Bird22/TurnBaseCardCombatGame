import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
    int a1 = 0;
    int b1 = 0;
    int c1 = 0;
    int d1 = 0;
    int e1 = 0;
    int f1 = 0;
    int g1 = 0;
    int h1 = 0;
    int i1 = 0;
    int j1 = 0;
    int k1 = 0;
    int l1 = 0;
    int m1 = 0;
    int a2 = 3;
    int b2 = 1;
    int c2 = 1;
    int d2 = 1;
    int e2 = 2;
    int f2 = 1;
    int g2 = 0;
    int h2 = 0;
    int i2 = 0;
    int j2 = 0;
    int k2 = 0;
    int l2 = 0;
    int m2 = 0;
    int a = a1;
    int b = b1;
    int c = c1;
    int d = d1;
    int e = e1;
    int f = f1;
    int g = g1;
    int h = h1;
    int i = i1;
    int j = j1;
    int k = k1;
    int l = l1;
    int m = m1;
    ArrayList<Integer> deck = new ArrayList<Integer>();
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
        addObject(deck,234,365);
        StabCard stabCard = new StabCard();
        addObject(stabCard,27,365);
        energyBar = new Energy();
        addObject(energyBar,570,370);
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
            a = a2;
            b = b2;
            c = c2;
            d = d2;
            e = e2;
            f = f2;
            g = g2;
            h = h2;
            i = i2;
            j = j2;
            k = k2;
            l = l2;
            m = m2;
        }
        //AdminMethodOfNewTestTurn
        if(Greenfoot.isKeyDown("W"))
        {
            newTurn();
            Greenfoot.delay(10);
        }
        //Text On Screen To See The Variables
        showText("a =" + a, 50, 50);
        showText("b =" + b, 50, 70);
        showText("c =" + c, 50, 90);
        showText("d =" + d, 50, 110);
        showText("e =" + e, 50, 130);
        showText("f =" + f, 50, 150);
        showText("deck =" + deck, 70, 190);
        showText("DeckAmount =" + deckAmount, 90, 210);
        //Each Refers To Adding A Possibility To Add A Card To The Deck
        if (a2 > 0)
        {
            deck.add(1);
            a2--;
            a1 = a1 + 1;
        }
        if (b2 > 0)
        {
            deck.add(2);
            b2--;
            b1++;
        }
        if (c2 > 0)
        {
            deck.add(3);
            c2--;
            c1++;
        }
        if (d2 > 0)
        {
            deck.add(4);
            d2--;
            d1++;
        }
        if (e2 > 0)
        {
            deck.add(5);
            e2--;
            e1++;
        }
        if (f2 > 0)
        {
            deck.add(6);
            f2--;
            f1++;
        }
        if (g2 > 0)
        {
            deck.add(7);
            g2--;
            g1++;
        }
        if (h2 > 0)
        {
            deck.add(8);
            h2--;
            h1++;
        }
        if (i2 > 0)
        {
            deck.add(9);
            i2--;
            i1++;
        }
        if (j2 > 0)
        {
            deck.add(10);
            j2--;
            j1++;
        }
        if (k2 > 0)
        {
            deck.add(11);
            k2--;
            k1++;
        }
        if (l2 > 0)
        {
            deck.add(12);
            l2--;
            l1++;
        }
        if (m2 > 0)
        {
            deck.add(13);
            m2--;
            m1++;
        }
    }
    //Filler Turn Code
    //(Just Put This In The Actual Turn Method)
    public void newTurn()
    {
        //Selects A Random Number Of Only The Numbers Put Into The cards Variable
        for (i = 0; i < 4; i++)
        {
            int choice = deck.get(Greenfoot.getRandomNumber(deck.size()));
            //The Code For After A Card Is Selected It Gets Added Into Your Hand
            int cardsInHand = 0;
            int usedCards = 0;
            int ownedCards = a + b + c + d + e + f + g + h + i + j + k + l + m;
            int deckAmount = ownedCards - cardsInHand - usedCards;
            if (deckAmount == 0)
            {
                a = a2;
                b = b2;
                c = c2;
                d = d2;
                e = e2;
                f = f2;
                g = g2;
                h = h2;
                i = i2;
                j = j2;
                k = k2;
                l = l2;
                m = m2;
            }
            if (choice == 1)
            {
                if (a > 0)
                {
                    addObject(new StabCard(), 200, 200);
                    a--;
                }
                else i--;
            }
            if (choice == 2)
            {
                if (b > 0)
                {
                    addObject(new HeavyShieldCard(), 200, 200);
                    b--;
                }
                else i--;
            }
            if (choice == 3)
            {
                if (c > 0)
                {
                    addObject(new PiercingBoltCard(), 200, 200);
                    c--;
                }
                else i--;
            }
            if (choice == 4)
            {
                if (d > 0)
                {
                    addObject(new HeavyStrikeCard(), 200, 200);
                    d--;
                }
                else i--;
            }
            if (choice == 5)
            {
                if (e > 0)
                {
                    addObject(new FastBlockCard(), 200, 200);
                    e--;
                }
                else i--;
            }
            if (choice == 6)
            {
                if (f > 0)
                {
                    addObject(new FireBallCard(), 200, 200);
                    f--;
                }
                else i--;
            }
        }
    }
    
    
}
//private boolean mouseOnObject(Actor actor) {
//    MouseInfo mouse = Greenfoot.getMouseInfo();
//    return mouse != null && mouse.getX() > actor.getX() - actor.getImage().getWidth()/2 && mouse.getX() < actor.getX() + actor.getImage().getWidth()/2 && 
//       mouse.getY() > actor.getY() - actor.getImage().getHeight()/2 && mouse.getY() < actor.getY() + actor.getImage().getHeight()/2;