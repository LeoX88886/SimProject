import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Team3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team3 extends Teams
{
    /**
     * Act - do whatever the Team3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage teamImage = new GreenfootImage("images/TeamsPic/BlueTeam.png");
    public Team3()
    {
        teamImage.scale(35,35);
        setImage(teamImage);
    }
    public void act()
    {
        // Add your action code here.
        super.act();
    }
}
