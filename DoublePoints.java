import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoublePoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoublePoints extends Effects
{
    private GreenfootImage effectImage = new GreenfootImage("images/Effects/pointup.png");
    private GreenfootSound dp = new GreenfootSound("sounds/DoublePoints.mp3");
    
    public void act()
    {
        // Add your action code here.
        effectImage.scale(50, 50);
        setImage(effectImage);
        
        
        checkHitTeams();
        
        if(delete){
            removeThis();
        }
    }
    
    public boolean checkHitTeams(){
        Teams t = (Teams)getOneObjectAtOffset(0, 0, Teams.class);
        if(t != null){
            //do something when hitting teams
            dp.setVolume(50);
            dp.play();
            Games.setSMultiplier(2);
            MyWorld.subK();
            delete = true;
            return true;
        }
        return false;
    }
    
    public void removeThis(){
        getWorld().removeObject(this);
    }
}