import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Team1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team1 extends Teams
{
    private GreenfootImage teamImage = new GreenfootImage("images/TeamsPic/GreenTeam.png");
    public Team1()
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