import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SettingButton extends Actor
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage settImage = new GreenfootImage("images/LobbyWorld/settingButtonFade.png");
    public SettingButton()
    {
        
        
        
        setImage(settImage);
    }
    
    public void act()
    {
        if (Greenfoot.mouseMoved(this))//if mouse is hovering
        {
            setImage(new GreenfootImage("images/LobbyWorld/settingButton.png"));
        }
        
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))//if not hovering
        {
            setImage(new GreenfootImage("images/LobbyWorld/settingButtonFade.png"));
            
        }
              
        if (Greenfoot.mouseClicked(this)) 
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}

