import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Team2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team2 extends Teams
{
    private GreenfootImage teamImage = new GreenfootImage("images/TeamsPic/RedTeam.png");
    public Team2()
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
