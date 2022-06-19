import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 625, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        for (int i = 0; i < 5; i ++) 
        {
            addObject(new Path(), 50*i + 10, 500); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path(), 50*i + 370, 500); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path2(),495 , 50*i + 375); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path2(),325, 50*i + 300); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path(), 50*i + 360, 360); 
        }
        for (int i = 0; i < 5; i ++) 
        {
            addObject(new Path(), 50*i + 370, 550); 
        }
        for (int i = 0; i < 2; i ++) 
        {
            addObject(new Path(), 50*i + 730, 550); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path2(),805, 50*i + 425); 
        }
        for (int i = 0; i < 4; i ++) 
        {
            addObject(new Path(), 50*i + 630, 410); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path(), 50*i + 730, 600); 
        }
        for (int i = 0; i < 5; i ++) 
        {
            addObject(new Path2(),855, 50*i + 375); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path2(),583, 50*i + 275); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path(), 50*i + 200, 280); 
        }
        for (int i = 0; i < 3; i ++) 
        {
            addObject(new Path2(),172, 50*i + 155); 
        }
        for (int i = 0; i < 10; i ++) 
        {
            addObject(new Path(), 50*i + 210, 125); 
        }
        for (int i = 0; i < 2; i ++) 
        {
            addObject(new Path2(),585, 50*i + 155); 
        }
        for (int i = 0; i < 1; i ++) 
        {
            addObject(new Path(), 50*i + 710, 85); 
        }
        addObject( new EndPath1(), 260, 500); 
        addObject( new World1(), 325, 450); 
        World1 world12 = new World1();
        addObject(world12,325,500);
        World1 world13 = new World1();
        addObject(world13,325,550);
        Wizard wizard = new Wizard();
        addObject(wizard,20,502);
        Wall wall = new Wall(300, 10);
        addObject(wall,120,460);
        Wall wall2 = new Wall(300, 10);
        addObject(wall2,120,540);
        FinalBoss finalBoss = new FinalBoss();
        addObject(finalBoss,794,78); 
        addObject( new EndPath2(), 625, 550);
        addObject( new World1(), 685, 550);
        addObject( new World1(), 685, 500);
        addObject( new World1(), 685, 600);
        addObject( new World1(), 580, 410);
        Coin coin = new Coin(50, 50);
        addObject(coin,850,337);
        addObject( new World1(), 172, 120);
        addObject( new World1(), 122, 120);
        Path path37 = new Path();
        addObject(path37,76,119);
        Coin coin2 = new Coin(50, 50);
        addObject(coin2,33,118);
        addObject( new World1(), 583, 240); 
        Path2 path224 = new Path2();
        addObject(path224,688,101);
    }
}
