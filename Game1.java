import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game1 extends Games
{
    /**
     * Act - do whatever the Game1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage teamImage = new GreenfootImage("images/GamesIcon/game.png");
    public void act()
    {
        // Add your action code here.
        setImage(teamImage);
        super.act();
    }
}
