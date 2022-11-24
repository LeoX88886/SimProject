import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Effects superclass used for creating subclasses of different effects
 * 
 * @author Justin Sin
 * @version 1
 */
public abstract class Effects extends Actor
{
    //boolean for deleting the spawned object
    protected boolean delete = false;
    
    /**
     * Abstract method for subclasses
     */
    public abstract boolean checkHitTeams();
    
    /**
     * Abstract method for subclasses
     */
    public abstract void removeThis();
    
    public void act()
    {
        
    }
}