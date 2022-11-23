import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A back button that returns the user to LobbyWorld when pressed
 * 
 * @author Tyson Pellatt
 * @version 1
 */
public class MainMenuButton extends Actor
{
    /**
     * Act - do whatever the MainMenuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private static GreenfootImage MainMenu = new GreenfootImage ("images/backButton2.png");
    public void act()
    {
        // Add your action code here.
        setImage(MainMenu);
    }
}
