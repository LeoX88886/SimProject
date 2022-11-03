import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Team4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team4 extends Teams
{
    /**
     * Act - do whatever the Team4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage teamImage = new GreenfootImage("images/TeamsPic/PurpleTeam.png");
    public Team4()
    {
        teamImage.scale(35,35);
        setImage(teamImage);
        super.setF();
    }
    public void act()
    {
        // Add your action code here.
        super.act();
    }
}
