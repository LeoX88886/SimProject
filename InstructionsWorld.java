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
    //image for the background of this class
    protected static GreenfootImage background = new GreenfootImage ("images/InstructionsScreen.png");
    //back button to return to LobbyWorld
    BackButton b = new BackButton();
    //play this sound when backbutton is pressed
    private GreenfootSound button = new GreenfootSound("sounds/button.wav");
    
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
            button.setVolume(70);
            button.play();
            Greenfoot.setWorld(new LobbyWorld());
        }
    }
}