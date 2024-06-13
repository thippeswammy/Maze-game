import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{
    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        prepare();
    }

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock MazeBlock = new MazeBlock();
        addObject(MazeBlock,0*50,10*50);
        MazeBlock MazeBlock2 = new MazeBlock();
        addObject(MazeBlock2,0*50,9*50);
        MazeBlock2.setLocation(0*50,9*50);
        MazeBlock MazeBlock3 = new MazeBlock();
        addObject(MazeBlock3,0*50,9*50);
        MazeBlock MazeBlock4 = new MazeBlock();
        addObject(MazeBlock4,0*50,8*50);
        MazeBlock MazeBlock5 = new MazeBlock();
        addObject(MazeBlock5,2*50,10*50);
        MazeBlock MazeBlock6 = new MazeBlock();
        addObject(MazeBlock6,2*50,9*50);
        MazeBlock5.setLocation(2*50,11*50);
        MazeBlock6.setLocation(2*50,9*50);
        MazeBlock MazeBlock7 = new MazeBlock();
        addObject(MazeBlock7,1*50,8*50);
        MazeBlock MazeBlock8 = new MazeBlock();
        addObject(MazeBlock8,2*50,8*50);
        MazeBlock MazeBlock9 = new MazeBlock();
        addObject(MazeBlock9,3*50,8*50);
        MazeBlock MazeBlock10 = new MazeBlock();
        addObject(MazeBlock10,4*50,8*50);
        MazeBlock MazeBlock11 = new MazeBlock();
        addObject(MazeBlock11,4*50,10*50);
        MazeBlock MazeBlock12 = new MazeBlock();
        addObject(MazeBlock12,6*50,11*50);
        MazeBlock MazeBlock13 = new MazeBlock();
        addObject(MazeBlock13,6*50,10*50);
        MazeBlock MazeBlock14 = new MazeBlock();
        addObject(MazeBlock14,6*50,9*50);
        MazeBlock MazeBlock15 = new MazeBlock();
        addObject(MazeBlock15,6*50,8*50);
        MazeBlock MazeBlock16 = new MazeBlock();
        addObject(MazeBlock16,6*50,7*50);
        MazeBlock MazeBlock17 = new MazeBlock();
        addObject(MazeBlock17,6*50,6*50);
        MazeBlock MazeBlock18 = new MazeBlock();
        addObject(MazeBlock18,7*50,6*50);
        MazeBlock MazeBlock19 = new MazeBlock();
        addObject(MazeBlock19,5*50,6*50);
        MazeBlock19.setLocation(5*50,6*50);
        MazeBlock MazeBlock20 = new MazeBlock();
        addObject(MazeBlock20,5*50,6*50);
        MazeBlock MazeBlock21 = new MazeBlock();
        addObject(MazeBlock21,5*50,5*50);
        MazeBlock MazeBlock22 = new MazeBlock();
        addObject(MazeBlock22,5*50,4*50);
        MazeBlock MazeBlock23 = new MazeBlock();
        addObject(MazeBlock23,5*50,3*50);
        MazeBlock MazeBlock24 = new MazeBlock();
        addObject(MazeBlock24,3*50,6*50);
        MazeBlock MazeBlock25 = new MazeBlock();
        addObject(MazeBlock25,3*50,5*50);
        MazeBlock MazeBlock26 = new MazeBlock();
        addObject(MazeBlock26,3*50,3*50);
        MazeBlock MazeBlock27 = new MazeBlock();
        addObject(MazeBlock27,1*50,6*50);
        MazeBlock MazeBlock28 = new MazeBlock();
        addObject(MazeBlock28,1*50,5*50);
        MazeBlock MazeBlock29 = new MazeBlock();
        addObject(MazeBlock29,1*50,4*50);
        MazeBlock MazeBlock30 = new MazeBlock();
        addObject(MazeBlock30,1*50,3*50);
        MazeBlock MazeBlock31 = new MazeBlock();
        addObject(MazeBlock31,1*50,2*50);
        MazeBlock MazeBlock32 = new MazeBlock();
        addObject(MazeBlock32,2*50,2*50);
        MazeBlock MazeBlock33 = new MazeBlock();
        addObject(MazeBlock33,3*50,2*50);
        MazeBlock MazeBlock34 = new MazeBlock();
        addObject(MazeBlock34,1*50,1*50);
        MazeBlock MazeBlock35 = new MazeBlock();
        addObject(MazeBlock35,3*50,1*50);
        MazeBlock MazeBlock36 = new MazeBlock();
        addObject(MazeBlock36,6*50,2*50);
        MazeBlock MazeBlock37 = new MazeBlock();
        addObject(MazeBlock37,7*50,2*50);
        MazeBlock MazeBlock38 = new MazeBlock();
        addObject(MazeBlock38,6*50,1*50);
        MazeBlock MazeBlock39 = new MazeBlock();
        addObject(MazeBlock39,5*50,1*50);
        MazeBlock MazeBlock40 = new MazeBlock();
        addObject(MazeBlock40,4*50,1*50);
        MazeBlock MazeBlock41 = new MazeBlock();
        addObject(MazeBlock41,8*50,0*50);
        MazeBlock MazeBlock42 = new MazeBlock();
        addObject(MazeBlock42,9*50,1*50);
        MazeBlock MazeBlock43 = new MazeBlock();
        addObject(MazeBlock43,10*50,1*50);
        MazeBlock MazeBlock44 = new MazeBlock();
        addObject(MazeBlock44,9*50,2*50);
        MazeBlock MazeBlock45 = new MazeBlock();
        addObject(MazeBlock45,10*50,2*50);
        MazeBlock MazeBlock46 = new MazeBlock();
        addObject(MazeBlock46,9*50,3*50);
        MazeBlock MazeBlock47 = new MazeBlock();
        addObject(MazeBlock47,8*50,4*50);
        MazeBlock MazeBlock48 = new MazeBlock();
        addObject(MazeBlock48,7*50,4*50);
        MazeBlock MazeBlock49 = new MazeBlock();
        addObject(MazeBlock49,10*50,4*50);
        MazeBlock MazeBlock50 = new MazeBlock();
        addObject(MazeBlock50,10*50,5*50);
        MazeBlock MazeBlock51 = new MazeBlock();
        addObject(MazeBlock51,10*50,6*50);
        MazeBlock MazeBlock52 = new MazeBlock();
        addObject(MazeBlock52,10*50,7*50);
        MazeBlock MazeBlock53 = new MazeBlock();
        addObject(MazeBlock53,9*50,6*50);
        MazeBlock MazeBlock54 = new MazeBlock();
        addObject(MazeBlock54,9*50,8*50);
        MazeBlock MazeBlock55 = new MazeBlock();
        addObject(MazeBlock55,9*50,9*50);
        MazeBlock MazeBlock56 = new MazeBlock();
        addObject(MazeBlock56,9*50,10*50);
        MazeBlock54.setLocation(8*50,8*50);
        MazeBlock55.setLocation(8*50,9*50);
        MazeBlock56.setLocation(8*50,10*50);
        MazeBlock MazeBlock57 = new MazeBlock();
        addObject(MazeBlock57,9*50,8*50);
        MazeBlock MazeBlock58 = new MazeBlock();
        addObject(MazeBlock58,10*50,10*50);
        MazeBlock MazeBlock59 = new MazeBlock();
        addObject(MazeBlock59,10*50,9*50);
        MazeBlock15.setLocation(6*50,8*50);
        MazeBlock MazeBlock60 = new MazeBlock();
        addObject(MazeBlock60,445,583);
        MazeBlock5.setLocation(100,535);
        MazeBlock MazeBlock61 = new MazeBlock();
        addObject(MazeBlock61,100,535);
        MazeBlock5.setLocation(100,553);
        MazeBlock MazeBlock62 = new MazeBlock();
        addObject(MazeBlock62,100,553);
        MazeBlock5.setLocation(100,572);
        MazeBlock MazeBlock63 = new MazeBlock();
        addObject(MazeBlock63,100,572);
        MazeBlock63.setLocation(100,580);
        MazeBlock MazeBlock64 = new MazeBlock();
        addObject(MazeBlock64,100,580);
        MazeBlock MazeBlock65 = new MazeBlock();
        addObject(MazeBlock65,300,589);
        MazeBlock MazeBlock66 = new MazeBlock();
        addObject(MazeBlock66,196,587);
        MazeBlock MazeBlock67 = new MazeBlock();
        addObject(MazeBlock67,573,573);
        MazeBlock MazeBlock68 = new MazeBlock();
        addObject(MazeBlock68,520,588);
        MazeBlock67.setLocation(566,580);
        MazeBlock MazeBlock69 = new MazeBlock();
        addObject(MazeBlock69,591,398);
        MazeBlock69.setLocation(598,407);
        MazeBlock61.setLocation(107,525);
        MazeBlock66.setLocation(213,571);
        MazeBlock66.setLocation(214,570);
        MazeBlock60.setLocation(448,585);
        MazeBlock61.setLocation(103,530);
        MazeBlock61.setLocation(113,522);
        MazeBlock66.setLocation(198,580);
        MazeBlock61.setLocation(122,524);
        MazeBlock61.setLocation(107,528);
        MazeBlock61.setLocation(120,536);
        MazeBlock67.setLocation(580,587);
        MazeRunner mazeRunner = new MazeRunner(3);
        addObject(mazeRunner,46,565);
        SpeedBoost SpeedBoost = new SpeedBoost();
        addObject(SpeedBoost,151,340);
        SpeedBoost SpeedBoost2 = new SpeedBoost();
        addObject(SpeedBoost2,441,199);
        SpeedBoost SpeedBoost3 = new SpeedBoost();
        addObject(SpeedBoost3,500,389);
        SpeedBoost SpeedBoost4 = new SpeedBoost();
        addObject(SpeedBoost4,95,47);
        SpeedBoost4.setLocation(95,47);
        SpeedBoost SpeedBoost5 = new SpeedBoost();
        addObject(SpeedBoost5,95,47);
        SpeedBoost SpeedBoost6 = new SpeedBoost();
        addObject(SpeedBoost6,101,132);
        EnemyFlyer EnemyFlyer = new EnemyFlyer();
        addObject(EnemyFlyer,57,346);
        EnemyFlyer EnemyFlyer2 = new EnemyFlyer();
        addObject(EnemyFlyer2,99,10);
        EnemyFlyer EnemyFlyer3 = new EnemyFlyer();
        addObject(EnemyFlyer3,452,496);
        EnemyFlyer EnemyFlyer4 = new EnemyFlyer();
        addObject(EnemyFlyer4,302,192);
        EnemyWalker EnemyWalker = new EnemyWalker(true);
        addObject(EnemyWalker,248,353);
        EnemyWalker EnemyWalker2 = new EnemyWalker(false);
        addObject(EnemyWalker2,29,344);
        EnemyWalker EnemyWalker3 = new EnemyWalker(true);
        addObject(EnemyWalker3,447,534);
        YouWinPlatform YouWinPlatform = new YouWinPlatform();
        addObject(YouWinPlatform,562,71);
        EnemyWalker EnemyWalker4 = new EnemyWalker(false);
        addObject(EnemyWalker4,515,393);
        EnemyWalker4.setLocation(495,406);
}
}
