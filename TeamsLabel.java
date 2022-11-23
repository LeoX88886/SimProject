import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Teams label
 * 
 * @author Tyson Pellatt
 * @version 1
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
