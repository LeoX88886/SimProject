import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionButton extends Actor
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage inImage = new GreenfootImage("images/LobbyWorld/instructionButtonFade.png");
    public InstructionButton()
    {
        
        
        
        setImage(inImage);
    }
    
    public void act()
    {
        if (Greenfoot.mouseMoved(this))//if mouse is hovering
        {
            setImage(new GreenfootImage("images/LobbyWorld/instructionButton.png"));
        }
        
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))//if not hovering
        {
            setImage(new GreenfootImage("images/LobbyWorld/instructionButtonFade.png"));
            
        }
              
        if (Greenfoot.mouseClicked(this)) 
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}

