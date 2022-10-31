import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Teams here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teams extends Actor
{
    /**
     * Act - do whatever the Teams wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage teamImage = new GreenfootImage("images/TeamsPic/t1.png");
    
    public Teams()
    {
        teamImage.scale(30,30);
        setImage(teamImage);
    }
    public void act()
    {
        // Add your action code here.
        
    }
}
