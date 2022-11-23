import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Image heavily inspired by an item in the game "Battle Cats" by PONOS
 * 
 * SpeedUp double the speed of the team subclass that interacts with it
 * for 5 seconds
 * 
 * @author Justin Sin
 * @version 1
 */
public class SpeedUp extends Effects
{
    private GreenfootImage effectImage = new GreenfootImage("images/Effects/SpeedUp.png");
    
    public void act()
    {
        // Add your action code here.
        effectImage.scale(50, 50);
        setImage(effectImage);
        
        checkHitTeams();
        
        if(delete){
            //removes this object when collision against MC or teams
            removeThis();
        }
    }
    
    //Check if hitting team
    public boolean checkHitTeams(){
        //this is left blank as an error requires the checkHit to be in Teams class
        return false;
    }
    
    public void removeThis(){
        getWorld().removeObject(this);
    }
}