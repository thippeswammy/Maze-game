import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class youLosePlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouLosePlatform extends Actor
{
    /**
     * Act - do whatever the youLosePlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Greenfoot.setWorld(new MazeWorld()); 
        Greenfoot.stop();
    }    
}
