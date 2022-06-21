import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Battlescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battlescreen extends World
{
    //Allows Energy Bar To Be Used In Other Actors
    Energy energyBar;
    //Card Variables 
    //"Letter"1 is a variable that's the total amount of a card
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
    //"Letter"2 is A Variable Used To Add Cards To The Card Picker
    //And Then Add It To To "Letter"1 Variables
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
    //"Letter" is the amount of cards currently in your deck
    //that haven't been used yet
    int a = a2;
    int b = b2;
    int c = c2;
    int d = d2;
    int e = e2;
    int f = f2;
    int g = g2;
    int h = h2;
    int i = i2;
    int j = j2;
    int k = k2;
    int l = l2;
    int m = m2;
    //Int For Turning Screen Numbers On
    int textOnScreen = -1;
    //The Array Used To Pick 4 Cards Every Turn
    ArrayList<Integer> deck = new ArrayList<Integer>();
    Enemy dmg;
    Enemy dmgh;
    Enemy action;
    Enemy cldwn;
    Enemy spec;
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
        Player player = new Player();
        addObject(player,450,200);
        //AddEnergy
        energyBar = new Energy();
        addObject(energyBar,550,380);
    }
    public void act()
    {
         //Temporary Way For "New Turn"
        if (Greenfoot.isKeyDown("W"))
        {
            newTurn();
            Greenfoot.delay(30);
        }
         //Variable For The Cards Locations
        int ownedCards = a + b + c + d + e + f + g + h + i + j + k + l + m;
        int deckAmount = ownedCards;
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
        if (Greenfoot.isKeyDown ("Enter"))
        {
            textOnScreen = textOnScreen*-1;
            Greenfoot.delay(30);
        }
        //Code To Show Number Of Cards (For Coding)
        //You Can't Remove The Text After Added 
        if (textOnScreen == 1)
        {
            //Text On Screen To See The Variables
            showText("a =" + a, 50, 50);
            showText("b =" + b, 50, 70);
            showText("c =" + c, 50, 90);
            showText("d =" + d, 50, 110);
            showText("e =" + e, 50, 130);
            showText("f =" + f, 50, 150);
            showText("deck =" + deck, 70, 190);
            showText("DeckAmount =" + deckAmount, 90, 210);
        }
    }
     //Filler Turn Code
    //(Just Put This In The Actual Turn Method)
    public void newTurn()
    {
         //Selects A Random Number Of Only The Numbers Put Into The cards Variable
        for (int ii = 0; ii < 4; ii++)
        {
            int choice = deck.get(Greenfoot.getRandomNumber(deck.size()));
            //The Code For After A Card Is Selected It Gets Added Into Your Hand
            int ownedCards = a + b + c + d + e + f + g + h + i + j + k + l + m;
            int deckAmount = ownedCards;
            if (choice == 1)
            {
                if (a > 0)
                {
                    addObject(new StabCard(), 50*ii + 30, 365);
                    a--;
                }
                else ii--;
            }
            if (choice == 2)
            {
                if (b > 0)
                {
                    addObject(new HeavyShieldCard(), 50*ii + 30, 365);
                    b--;
                }
                else ii--;
            }
            if (choice == 3)
            {
                if (c > 0)
                {
                    addObject(new PiercingBoltCard(), 50*ii + 30, 365);
                    c--;
                }
                else ii--;
            }
            if (choice == 4)
            {
                if (d > 0)
                {
                    addObject(new HeavyStrikeCard(), 50*ii + 30, 365);
                    d--;
                }
                else ii--;
            }
            if (choice == 5)
            {
                if (e > 0)
                {
                    addObject(new FastBlockCard(), 50*ii + 30, 365);
                    e--;
                }
                else ii--;
            }
            if (choice == 6)
            {
                if (f > 0)
                {
                    addObject(new IceBallCard(), 50*ii + 30, 365);
                    f--;
                }
                else ii--;
            }
            //Shuffle Used Cards Back Into Deck (Incase You Reach 0 cards mid turn)
            if (deckAmount == 0)
            {
                a = a1;
                b = b1;
                c = c1;
                d = d1;
                e = e1;
                f = f1;
                g = g1;
                h = h1;
                i = i1;
                j = j1;
                k = k1;
                l = l1;
                m = m1;
            }
        }
        energyBar.energy = 3;
    }
}
