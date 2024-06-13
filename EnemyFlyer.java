import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyFlyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyFlyer extends Enemies
{
    /**
     * Act - do whatever the EnemyFlyer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyFlyer()
    {
        scaleDownImage(2,2); 
    }

    public void act() 
    {
        move(3);
        wrapAtEdge();
    }    
}
