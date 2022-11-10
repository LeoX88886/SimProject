import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoublePoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoublePoints extends Effects
{
    private GreenfootImage effectImage = new GreenfootImage("images/Effects/coin.png");
    
    public void act()
    {
        // Add your action code here.
        effectImage.scale(50, 50);
        setImage(effectImage);
    }
    
    public boolean checkHitTeams(){
        //can't double whats not there
        return false;
    }
    
    public boolean checkHitMC(){
        //can't double whats not there
        return false;
    }
}