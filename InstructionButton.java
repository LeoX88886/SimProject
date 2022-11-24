import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a button with the word "Instruction" on it
 * when pressed, brings the user to InstructionWorld
 * 
 * @author leo Xu(code), Justin Sin(image)
 * @version 1
 */
public class InstructionButton extends Actor
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage inImage = new GreenfootImage("images/LobbyWorld1/instructionButtonFade.png");
    private GreenfootSound button = new GreenfootSound("sounds/button.wav");
    
    public InstructionButton()
    {
        setImage(inImage);
    }
    
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

