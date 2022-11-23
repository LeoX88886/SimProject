import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Effects superclass used for creating subclasses of different effects
 * 
 * @author Justin Sin
 * @version 1
 */
public abstract class Effects extends Actor
{
    protected boolean delete = false;
    
    public abstract boolean checkHitTeams();
    public abstract void removeThis();
    
    public void act()
    {
        //
    }
}