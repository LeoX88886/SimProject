import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world created to host an image
 * image is that of the instructions of how this simulation works
 * has a back button to return to LobbyWorld (Homescreen)
 * 
 * @author Justin Sin
 * @version 1
 */
public class InstructionsWorld extends World
{
    protected static GreenfootImage background = new GreenfootImage ("images/InstructionsScreen.png");
    BackButton b = new BackButton();
    
    /**
     * Constructor for objects of class InstructionsWorld.
     * 
     */
    public InstructionsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        background = new GreenfootImage ("images/InstructionsScreen.png");
        setBackground (this.background);
        addObject(b, 60, 375);
    }
    
    public void act(){
        LobbyWorld.stopMusic();
        if (Greenfoot.mouseClicked(b)) 
        {   
            Greenfoot.setWorld(new LobbyWorld());
        }
    }
}