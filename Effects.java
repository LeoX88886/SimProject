import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Effects here.
 * 
 * @author Justin Sin
 * @version 1
 */
public class Effects extends Actor
{
    private GreenfootImage effectImage = new GreenfootImage("images/Effects/coin.png");
    
    public Effects()
    {
        effectImage.scale(50, 50);
        setImage(effectImage);

    }
    
    public boolean checkHitTeams(){
        Teams t = (Teams)getOneObjectAtOffset(2+getImage().getWidth()/2, 0, Teams.class);
        if(t != null){
            //t.removeItem();
            return true;
        }
        return false;
    }
    
    public boolean checkHitMC(){
        MainCharacter mc = (MainCharacter)getOneObjectAtOffset(2+getImage().getWidth()/2, 0, MainCharacter.class);
        if(mc != null){
            mc.hitByEffect();
            return true;
        }
        return false;
    }
    
    public void act()
    {
        // Add your action code here.
        checkHitTeams();
        checkHitMC();
        
    }
}
