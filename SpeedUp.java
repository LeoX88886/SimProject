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
    
    public void act()
    {
        // Add your action code here.
        effectImage.scale(50, 50);
        setImage(effectImage);
        
        checkHitMC();
        checkHitTeams();
    }
    
    public boolean checkHitTeams(){
        Teams t = (Teams)getOneObjectAtOffset(getImage().getWidth()/2, 0, Teams.class);
        if(t != null){
            t.speedingUp();
            return true;
        }
        return false;
    }
    
    public boolean checkHitMC(){
        MainCharacter mc = (MainCharacter)getOneObjectAtOffset(getImage().getWidth()/2, 0, MainCharacter.class);
        if(mc != null){
            mc.speedingUp();
            return true;
        }
        return false;
    }
}
