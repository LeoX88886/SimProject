import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Effects here.
 * 
 * @author Justin Sin
 * @version 1
 */
public abstract class Effects extends Actor
{
    protected boolean delete = false;
    
    public abstract boolean checkHitTeams();
    
    public void act()
    {
        //
    }
    
    public abstract void removeThis();
}