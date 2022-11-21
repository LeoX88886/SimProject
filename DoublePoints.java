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
    
    public void act()
    {
        // Add your action code here.
        effectImage.scale(50, 50);
        setImage(effectImage);
        
        checkHitMC();
        checkHitTeams();
        
        if(delete){
            removeThis();
        }
    }
    
    public boolean checkHitMC(){
        MainCharacter mc = (MainCharacter)getOneObjectAtOffset(0, 0, MainCharacter.class);
        if(mc != null){
            //do something when hitting MC
            delete = true;
            return true;
        }
        return false;
    }
    
    public boolean checkHitTeams(){
        Teams t = (Teams)getOneObjectAtOffset(0, 0, Teams.class);
        if(t != null){
            //do something when hitting teams
            delete = true;
            return true;
        }
        return false;
    }
    
    public void removeThis(){
        getWorld().removeObject(this);
    }
}