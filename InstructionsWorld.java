import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        if (Greenfoot.mouseClicked(b)) 
        {   
            Greenfoot.setWorld(new LobbyWorld());
        }
    }
}