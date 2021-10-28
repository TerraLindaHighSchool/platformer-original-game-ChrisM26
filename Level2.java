import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound Music = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 4;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 5;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
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
        addObject(new BrickWall(), 380, 600);
        addObject(new BrickWall(), 624, 407);
        addObject(new BrickWall(), 960, 100);
        addObject(new SmBrickWall(), 1120, 600);
        addObject(new SmBrickWall(), 880, 600);
        addObject(new SmBrickWall(), 429, 180);
        addObject(new SmBrickWall(), 1000, 600);
        addObject(new SmBrickWall(), 248, 304);
        addObject(new TrapDoor(GRAVITY), 72, 430);
        addObject(new TrapDoor(GRAVITY), 1000, 600);
        addObject(new Bomb(GRAVITY), 486, 140);
        addObject(new Bomb(GRAVITY), 1060, 544);
        addObject(new Gem(),975,160);
        addObject(new Gem(), 1030, 160);

        SmBrickWall smBrickWall6 = new SmBrickWall();
        addObject(smBrickWall6,1005,213);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
           addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }   
    }
}
