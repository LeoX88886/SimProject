import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Team3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team3 extends Teams
{
    private GreenfootImage teamImage = new GreenfootImage("images/TeamsPic/BlueTeam.png");
    public Team3()
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
