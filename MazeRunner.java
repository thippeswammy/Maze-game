import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner extends player
{
    /**
     * Act - do whatever the MazeRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mazeRunnerLives;
    public MazeRunner(int lives)
    {
        getImage().scale(getImage().getWidth()/5*2, getImage().getHeight()/5*2);
        mazeRunnerLives=lives;
    }

    public void act() 
    {
        slidAround();
        collectBoost();
        maxSpeed();
        mazeRunnerHit();
        youlose();
        YouWin();
    }    

    public void mazeRunnerHit()
    {
        if(hitEnemy())
        {
            mazeRunnerLives--;
            setLocation(50,560);
        }
    }

    public void youlose()
    {
        if(mazeRunnerLives==0)
        {
            getWorld().addObject(new YouLosePlatform(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.delay(60*5);
            Greenfoot.setWorld(new MazeWorld());
            Greenfoot.stop();
        }
    }
}
