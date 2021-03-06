import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound Music = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
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
        addObject(new BrickWall(), 380, 500);
        addObject(new BrickWall(), 780, 300);
        addObject(new BrickWall(), 960, 100);
        addObject(new SmBrickWall(), 1120, 600);
        addObject(new SmBrickWall(), 880, 600);
        addObject(new SmBrickWall(), 420, 160);
        addObject(new SmBrickWall(), 1000, 600);
        addObject(new SmBrickWall(), 220, 280);
        addObject(new TrapDoor(GRAVITY), 60, 400);
        addObject(new TrapDoor(GRAVITY), 1000, 600);
        addObject(new Bomb(GRAVITY), 455, 114);
        addObject(new Bomb(GRAVITY), 1060, 544);
        addObject(new Gem(),975,160);
        addObject(new Gem(), 1030, 160);

        Rock rock = new Rock(0.066f);
        addObject(rock,258,459);
        Rock rock2 = new Rock(0.066f);
        addObject(rock2,764,261);
        AcidRain acidRain = new AcidRain(0.066f);
        addObject(acidRain,527,575);
        AcidRain acidRain2 = new AcidRain(0.066f);
        addObject(acidRain2,1072,235);
        AcidRain acidRain3 = new AcidRain(0.066f);
        addObject(acidRain3,111,160);
        Health health4 = new Health();
        addObject(health4,219,232);
        Health health5 = new Health();
        addObject(health5,44,353);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
           addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }   
    }
}
