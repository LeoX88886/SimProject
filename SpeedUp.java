import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedUp extends Effects
{
    private GreenfootImage effectImage = new GreenfootImage("images/Effects/bluecoin.png");
    private boolean delete = false;
    
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
            mc.speedingUp();
            delete = true;
            return true;
        }
        return false;
    }
    
    public boolean checkHitTeams(){
        Teams t = (Teams)getOneObjectAtOffset(0, 0, Teams.class);
        if(t != null){
            t.speedingUp();
            delete = true;
            return true;
        }
        return false;
    }
    
    public void removeThis(){
        getWorld().removeObject(this);
    }
}