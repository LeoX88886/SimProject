import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LobbyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LobbyWorld extends World
{

    /**
     * Constructor for objects of class LobbyWorld.
     * 
     */
    
    protected static GreenfootImage background = new GreenfootImage ("images/jenshin.jpg");
    
    
    PlayButton pb = new PlayButton();
    SettingButton sb = new SettingButton();
    InstructionButton ib = new InstructionButton();

    public LobbyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(pb, 130, 300);
        addObject(sb, 280, 300);
        addObject(ib, 430, 300);
        
        background = new GreenfootImage ("images/jenshin.jpg");
        
        setBackground (background);
        
        
        
    }
    
    public void act()
    {
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText("X: " + String.valueOf(m.getX()), 200, 200);
            showText("Y: " + String.valueOf(m.getY()), 300, 200);
        }
    }
}
