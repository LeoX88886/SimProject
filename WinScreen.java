import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the win screen for whichever team won the simulation
 * (reaching required score stated in settings)
 * 
 * @author Leo Xu
 * @version 1
 */
public class WinScreen extends World
{
    private static GreenfootImage background = new GreenfootImage ("images/jenshin2.jpg");
    
    MainMenuButton b = new MainMenuButton();
    
    private static GreenfootSound winSound;
    
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        
        background = new GreenfootImage ("images/jenshin2.jpg");
        
        winSound = new GreenfootSound("sounds/applause.wav"); //instance of win sound effect
        
        setBackground(background);
        
    }
    
    public void act()
    {
        MyWorld.stopMusic();
        addObject(b, 50, 360);

        started();
        if (Greenfoot.mouseClicked(b)) 
        {
            stopped();
            Greenfoot.setWorld(new LobbyWorld());
        }
    }
    
    public void started()//starts the theme sound when world starts
    {
        winSound.playLoop();
        winSound.setVolume(50);
    }
    
    public void stopped()// stops the theme sound when paused
    {
        winSound.stop();
    }
}
