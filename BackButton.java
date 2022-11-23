import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An image and object used to return to the previous world
 * etc. InstructionWorld -> LobbyWorld
 * 
 * @author Tyson Pellatt
 * @version 1
 */
public class BackButton extends Actor
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage settImage = new GreenfootImage("images/backButton2.png");
    public BackButton()
    {
        setImage(settImage);
    }
    
    public void act()
    {     
        
    }
}

