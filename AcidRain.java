import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AcidRain here.
 * 
 * @author chris Maldonado
 * @version 09/28/2021
 */
public class AcidRain extends Obstacle

{ private float yVelocity;
    private final float GRAVITY;
    
    public AcidRain(float gravity)
    {
        GRAVITY = gravity;
    }
    
    
    public void act()
    {
        fall();
    }
    
    protected void fall()
    {
        yVelocity += GRAVITY;
        setLocation(getX(), getY() + (int) yVelocity);
        removeOutOfbounds(this);
    }
}
    
