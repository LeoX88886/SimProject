import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SwapPoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwapPoints extends Effects
{
    private GreenfootImage effectImage = new GreenfootImage("images/Effects/graycoin.png");
    
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
        //can't switch whats not there
        return false;
    }
}