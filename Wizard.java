import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wizzard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wizard extends Actor
{
    private final int STEP = 3; 
    private int velocity;
    /**
     * Act - do whatever the wizzard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      Text text = new Text();
      if (Greenfoot.isKeyDown("W") && didBumpHead())
        {
            setLocation( getX(), getY()-5);
        }
      if (Greenfoot.isKeyDown("s") && isTouchingWall())
        {
            setLocation( getX(), getY()+5);
        } 
      if (Greenfoot.isKeyDown("d") && canMoveRight())
        {
            setLocation( getX() +5, getY());
        }  
      if (Greenfoot.isKeyDown("a") && canMoveLeft())
        {
            setLocation( getX()-5, getY());
        }    
      if (!getIntersectingObjects(Wall.class).isEmpty())
        {
          
        }  
      if (isTouching(EndPath1.class))
        { 
          getWorld().addObject( new Text(), 200, 200);  
        }
     }
    public boolean isTouchingWall()
    {
        boolean isTouchingWall = true; 
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight(); 
        if (getOneObjectAtOffset(imageWidth/ -2, imageHeight / 2, Wall.class) != null ||
        getOneObjectAtOffset(imageWidth/ 2, imageHeight / 2, Wall.class) != null) 
        isTouchingWall = false;         
        return isTouchingWall; 
    }
    public boolean didBumpHead()
    {
        boolean BumpHead = true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight(); 
        if (getOneObjectAtOffset(imageWidth/ -2, imageHeight /-2, Wall.class) !=null ||
        getOneObjectAtOffset(imageWidth/ 2, imageHeight /-2, Wall.class) !=null) 
        BumpHead = false; 
        
        return BumpHead;
    }
    public boolean canMoveLeft()
    {
        boolean canMoveLeft = true; 
        
        int imageWidth = getImage().getWidth(); 
        int imageHeight = getImage().getHeight();
        if (getOneObjectAtOffset(imageWidth/ -2 - STEP, imageHeight / -2, Wall.class) !=null ||
        getOneObjectAtOffset(imageWidth/ -2 - STEP, imageHeight / 2 -1, Wall.class) !=null)
        canMoveLeft = false; 
        
        return canMoveLeft;     
    }
    public boolean canMoveRight() 
    {
        boolean canMoveRight = true; 
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight(); 
        if (getOneObjectAtOffset(imageWidth/ 2 +STEP, imageHeight / -2, Wall.class) !=null ||
        getOneObjectAtOffset(imageWidth/ 2 +STEP, imageHeight / 2 -1, Wall.class) !=null)
        canMoveRight = false; 
        return canMoveRight;
    }
    
}
