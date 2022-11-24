import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a button with the word "INSTRUCTION" on it
 * when pressed, brings the user to InstructionWorld
 * 
 * @author leo Xu(code), Justin Sin(image)
 * @version 1
 */
public class InstructionButton extends Actor
{
    private GreenfootImage inImage = new GreenfootImage("images/LobbyWorld1/instructionButtonFade.png");
    private GreenfootSound button = new GreenfootSound("sounds/button.wav");
    
    /**
     * InstructionButton contructor
     */
    public InstructionButton()
    {
        setImage(inImage);
    }
    
    
    /**
     * Act method used to go to InstructionsWorld by mouse click
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))//if mouse is hovering
        {
            setImage(new GreenfootImage("images/LobbyWorld1/instructionButton.png"));
        }
        
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))//if not hovering
        {
            setImage(new GreenfootImage("images/LobbyWorld1/instructionButtonFade.png"));
            
        }
              
        if (Greenfoot.mouseClicked(this))
        {
            button.setVolume(70);
            button.play();
            Greenfoot.setWorld(new InstructionsWorld());
        }
    }
}

