import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game2 extends Games
{
    /**
     * Act - do whatever the Game2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage teamImage = new GreenfootImage("images/GamesIcon/game2.png");
    public void act()
    {
        // Add your action code here.
        setImage(teamImage);
        super.act();
    }
}
