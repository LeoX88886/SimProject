import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{
    private static GreenfootImage background = new GreenfootImage ("images/jenshin2.jpg");
    
    
    MainMenuButton b = new MainMenuButton();
    
    
    
    
    
    
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        
        background = new GreenfootImage ("images/jenshin2.jpg");
        
        setBackground(background);
        
    }
    
    public void act()
    {
        addObject(b, 50, 360);
        
        if (Greenfoot.mouseClicked(b)) 
        {
            Greenfoot.setWorld(new LobbyWorld());
        }
        
        
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText("X: " + String.valueOf(m.getX()), 200, 200);
            showText("Y: " + String.valueOf(m.getY()), 300, 200);
        }
    }
}
