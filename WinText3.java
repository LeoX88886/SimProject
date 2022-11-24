import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays this text when team 3 reaches the score requirement for a win
 * 
 * @author Leo Xu
 * @version 1
 */
public class WinText3 extends Actor
{
    private static GreenfootImage background = new GreenfootImage ("images/WinScreen/win3.png");
    
    /**
     * Act - do whatever the WinText1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(background);
    }
}
