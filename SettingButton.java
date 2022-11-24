import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * Creates a button with the word "SETTING" on it
 * when pressed, brings the user to InstructionWorld
 * 
 * @author leo Xu
 * @version 1
 */
public class SettingButton extends Actor
{
    //image for Settings Button
    private GreenfootImage settImage = new GreenfootImage("images/LobbyWorld1/settingButtonFade.png");
    //sound for when button is pressed
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
            setImage(new GreenfootImage("images/LobbyWorld1/settingButton.png"));//image of SettingsButton when mouse is hovering over it
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

