import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeamsLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeamsLabel extends Actor
{
    /**
     * Act - do whatever the TeamsLabel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected GreenfootImage Banner;
    public TeamsLabel( GreenfootImage Banner)
    {
        this.Banner = Banner;
        setImage(Banner);
    }
}
