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
        Wall wall3 = new Wall(10, 300);
        addObject(wall3,451,589);
        wall3.setLocation(885,464);
        Wall wall4 = new Wall(100, 10);
        addObject(wall4,492,595);
        wall4.setLocation(414,464);
        Wall wall5 = new Wall(10, 100);
        addObject(wall5,432,518);
        wall5.setLocation(200,201);

        Wall wall9 = new Wall(300, 10);
        addObject(wall9,653,481);
        wall9.setLocation(285,120);
        wall9.setLocation(115,79);
        Wall wall10 = new Wall(300, 10);
        addObject(wall10,439,73);
        wall10.setLocation(425,81);

        Wall wall13 = new Wall(20, 10);
        addObject(wall13,234,160);
        wall13.setLocation(230,153);

        Wall wall17 = new Wall(100, 10);
        addObject(wall17,401,311);
        wall17.setLocation(262,252);

        Wall wall19 = new Wall(150, 10);
        addObject(wall19,402,322);
        wall19.setLocation(451,324);

        Wall wall22 = new Wall(80, 10);
        addObject(wall22,763,574);
        wall22.setLocation(780,574);
        Wall wall23 = new Wall(100, 10);
        addObject(wall23,780,616);
        wall23.setLocation(415,386);
        Wall wall24 = new Wall(150, 10);
        addObject(wall24,689,511);
        wall24.setLocation(690,519);

        Wall wall26 = new Wall(10, 100);
        addObject(wall26,831,477);
        wall26.setLocation(826,521);

        Wall wall29 = new Wall(10, 100);
        addObject(wall29,520,396);
        wall29.setLocation(521,468);

        Wall wall31 = new Wall(10, 100);
        addObject(wall31,257,390);
        wall31.setLocation(289,385);
        Wall wall32 = new Wall(10, 200);
        addObject(wall32,649,263);
        wall32.setLocation(621,266);
        Wall wall33 = new Wall(10, 200);
        addObject(wall33,528,231);
        wall33.setLocation(544,292);
        wall33.setLocation(544,254);
        Wall wall34 = new Wall(10, 50);
        addObject(wall34,360,299);
        wall34.setLocation(349,297);
        Wall wall35 = new Wall(10, 100);
        addObject(wall35,135,235);
        wall35.setLocation(139,195);
        Wall wall36 = new Wall(10, 100);
        addObject(wall36,124,295);
        wall36.setLocation(136,309);
        Wall wall37 = new Wall(100, 10);
        addObject(wall37,72,171);
        wall37.setLocation(64,157);
        Wall wall38 = new Wall(10, 50);
        addObject(wall38,39,224);
        wall38.setLocation(6,123);
        Wall wall39 = new Wall(50, 10);
        addObject(wall39,841,278);
        wall39.setLocation(853,295);
        Wall wall40 = new Wall(50, 10);
        addObject(wall40,575,449);
        wall40.setLocation(574,444);

        Wall wall41 = new Wall(10, 100);
        addObject(wall41,829,405);
        wall41.setLocation(826,398);
        Wall wall27 = new Wall(200, 10);
        addObject(wall27,473,592);
        wall27.setLocation(381,584);
        removeObject(wall3);
        Wall wall28 = new Wall(5, 300);
        addObject(wall28,889,503);
        wall28.setLocation(887,451);
        Wall wall42 = new Wall(100, 5);
        addObject(wall,24205,334);
        Wall wall43 = new Wall(100, 5);
        addObject(wall43,221,324);
        wall43.setLocation(218,327);
        Wall wall30 = new Wall(300, 5);
        addObject(wall30,377,167);
        wall30.setLocation(379,163);
        Wall wall44 = new Wall(100, 5);
        addObject(wall44,579,587);
        Wall wall45 = new Wall(100, 5);
        addObject(wall45,740,470);
        wall45.setLocation(679,158);
        Wall wall46 = new Wall(5, 80);
        addObject(wall46,760,476);
        wall46.setLocation(760,473);
        Wall wall47 = new Wall(100, 5);
        addObject(wall47,691,364);
        wall47.setLocation(722,371);
        Wall wall48 = new Wall(80, 5);
        addObject(wall48,575,510);
        wall48.setLocation(572,512);
        Wall wall49 = new Wall(50, 5);
        addObject(wall49,629,70);
        wall49.setLocation(630,85);
        Wall wall50 = new Wall(100, 5);
        addObject(wall50,677,444);
        Wall wall51 = new Wall(100, 3);
        addObject(wall51,407,522);
        wall51.setLocation(421,521);
    }
}
