import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound Music = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 4;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 5;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(door,1171,44);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, 
                MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, Music);

        addObject(player,96,750);
        addObject(new Floor(), 600, 800);

        BrickWall brickWall = new BrickWall();
        addObject(brickWall,1001,616);
        brickWall.setLocation(1072,611);
        brickWall.setLocation(1053,614);
        brickWall.setLocation(580,512);
        brickWall.setLocation(614,516);
        brickWall.setLocation(671,523);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,521,660);
        brickWall.setLocation(957,100);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,261,460);
        smBrickWall.setLocation(939,653);
        TrapDoor trapDoor = new TrapDoor(0.066f);
        addObject(trapDoor,603,650);
        trapDoor.setLocation(684,660);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,592,287);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,965,381);
        Bomb bomb = new Bomb(0.066f);
        addObject(bomb,540,761);
        Bomb bomb2 = new Bomb(0.066f);
        addObject(bomb2,804,767);
        Bomb bomb3 = new Bomb(0.066f);
        addObject(bomb3,961,333);
        Rock rock = new Rock(0.066f);
        addObject(rock,56,421);
        AcidRain acidRain = new AcidRain(0.066f);
        addObject(acidRain,67,150);
        AcidRain acidRain2 = new AcidRain(0.066f);
        addObject(acidRain2,811,290);
        AcidRain acidRain3 = new AcidRain(0.066f);
        addObject(acidRain3,449,304);
        AcidRain acidRain4 = new AcidRain(0.066f);
        addObject(acidRain4,1091,452);
        Rock rock2 = new Rock(0.066f);
        addObject(rock2,384,577);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,389,608);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
           addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }   
    }
}
