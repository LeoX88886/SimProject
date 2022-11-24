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
    
    MainMenuButton b = new MainMenuButton();//back button
    
    private static GreenfootSound winSound;
    private GreenfootSound button = new GreenfootSound("sounds/button.wav");
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
        
        winSound.setVolume(75);
        winSound.play();
        
        setBackground(background);
        
    }
    
    /**
     * Act method for displaying the Team number that wins
     * 
     */
    public void act()
    {
        MyWorld.stopMusic();
        addObject(b, 50, 360);

        
        if (Greenfoot.mouseClicked(b)) 
        {
            button.setVolume(70);
            button.play();
            
            stopped();
            Greenfoot.setWorld(new LobbyWorld());
        }
    }
    
    /**
     * stops the win sound when paused
     * 
     */
    public void stopped()// stops the win sound when paused
    {
        winSound.stop();
    }
    
    /**
     * stops the win sound for other worlds
     * 
     */
    public static void stopSound()// stops the win sound for other worlds
    {
        winSound.stop();
    }
}
