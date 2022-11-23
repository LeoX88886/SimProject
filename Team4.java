import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * subclass for Teams superclass, contains a different color/image of teams
 * 
 * @author Tyson Darius Pellatt
 * @version 1
 */
public class Team4 extends Teams
{
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
