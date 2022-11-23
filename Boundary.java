import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Was not used
 * 
 * @author n/a
 * @version n/a
 */

public class Boundary extends Actor
{
    private GreenfootImage boundImage = new GreenfootImage ("images/Boundary/baal.png");
    
    public Boundary (int width, int height)//Sets the boundary's size
    {
        boundImage.scale(width, height);
        setImage(boundImage);
    }
}
