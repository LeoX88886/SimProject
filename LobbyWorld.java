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
    
    PlayButton b = new PlayButton();
    public LobbyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(b, 72, 66);
        
    }
    
    public void act()
    {
        
    }
}
