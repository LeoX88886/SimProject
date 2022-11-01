import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private static GreenfootImage background = new GreenfootImage ("images/pacMan Maze.png");
    
    //instance of the classes
    Effects e = new Effects();
    Games g = new Games();
    Teams t = new Teams();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 800, 1); 
        background = new GreenfootImage ("images/pacMan Maze.png");
        background.scale(1024, 800);
        setBackground (background);
        
        
        
        
        addObject(e, 100, 100);
        addObject(g, 100, 200);
        addObject(t, 100, 300);
        
        


        
    }
    
    public void act()
    {
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText("X: " + String.valueOf(m.getX()), 200, 200);
            showText("Y: " + String.valueOf(m.getY()), 300, 200);
        }
        
        
        showText("team 1 score: " + Games.getScoreOne(), 300, 50);
        showText("team 2 score: " + Games.getScoreTwo(), 500, 50);
        
        
    }
    
}
