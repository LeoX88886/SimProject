import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//Image heavily inspired by an item in  the game "Battle Cats" by PONOS
/**
 * Write a description of class SpeedUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        /*Teams t = (Teams)getOneObjectAtOffset(0, 0, Teams.class);
        if(t != null){
            delete = true;
            return true;
        }*/
        return false;
    }
    
    public void removeThis(){
        getWorld().removeObject(this);
    }
}