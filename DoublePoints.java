import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * DoublePoints will increase the amount of points gained when a team interacts
 * with a game, doubling the points earned for 3 games before returning
 * to the normal +1 per game
 * 
 * @author Justin Sin
 * @version 1
 */
public class DoublePoints extends Effects
{
    //image for DoublePoints
    private GreenfootImage effectImage = new GreenfootImage("images/Effects/pointup.png");
    
    //sound for DoublePoints
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
    
    /**
     * if DoublePoints touches the teams subclasses, it will play a sound, delete the DoublePoints object and set the score multiplier as 2x
     */
    public boolean checkHitTeams(){
        Teams t = (Teams)getOneObjectAtOffset(0, 0, Teams.class);
        if(t != null){
            //do something when hitting teams
            dp.setVolume(30);
            dp.play();
            Games.setSMultiplier(2);
            MyWorld.subK();
            delete = true;
            return true;
        }
        return false;
    }
    
    /**
     * remove object if called
     */
    public void removeThis(){
        getWorld().removeObject(this);
    }
}