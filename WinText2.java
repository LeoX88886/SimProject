import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays this text when team 2 reaches the score requirement for a win
 * 
 * @author Leo Xu, Tyson Pellatt
 * @version 1
 */
public class WinText2 extends Actor
{
    /**
     * Act - do whatever the WinText2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static GreenfootImage background = new GreenfootImage ("images/WinScreen/win2.png");
    public void act()
    {
        // Add your action code here.
        setImage(background);
    }
}
