import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Movers
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public void YouWin()
    {
        if(isTouching(YouWinPlatform.class))
        {
            getWorld().addObject(new YouWinScreen(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.delay(60*5);
            Greenfoot.setWorld(new MazeWorld()); 
        }
    }
}
