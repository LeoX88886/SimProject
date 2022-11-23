import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * subclass of Games with a different image
 * 
 * @author Leo Xu
 * @version 1
 */
public class Game4 extends Games
{
    /**
     * Act - do whatever the Game4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage teamImage = new GreenfootImage("images/GamesIcon/game4.png");
    public void act()
    {
        // Add your action code here.
        setImage(teamImage);
        super.act();
    }
}
