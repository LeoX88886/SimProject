import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SettingButton extends Actor
{
    private GreenfootImage settImage = new GreenfootImage("images/LobbyWorld1/settingButtonFade.png");
    private GreenfootSound button = new GreenfootSound("sounds/button.wav");
    
    
    /**
     * SettingWorld constructor
     */
    public SettingButton()
    {
        setImage(settImage);
    }
    
    /**
     * Act method used to go to SettingsWorld by mouse click
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))//if mouse is hovering
        {
            setImage(new GreenfootImage("images/LobbyWorld1/settingButton.png"));
        }
        
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))//if not hovering
        {
            setImage(new GreenfootImage("images/LobbyWorld1/settingButtonFade.png"));
            
        }
              
        if (Greenfoot.mouseClicked(this)) 
        {
            button.setVolume(70);
            button.play();
            Greenfoot.setWorld(new SettingsWorld());
        }
    }
}

