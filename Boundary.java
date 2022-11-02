import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boundary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
