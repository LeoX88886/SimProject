import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class T2Ch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class T2Ch extends Actor
{
    /**
     * Act - do whatever the T2Ch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected GreenfootImage Chosen = new GreenfootImage("images/SettingButtons/Choose2.png");
    protected GreenfootImage settImage = new GreenfootImage("images/SettingButtons/2Team's.png");
    public T2Ch()
    {
        setImage(Chosen);
    }
    public void act()
    {
        T3Ch t3 = new T3Ch();
        T4Ch t4 = new T4Ch();
        if (Greenfoot.mouseClicked(this) && getImage().equals(settImage)) 
        {
            MyWorld.setTeams(2);
            setImage(Chosen);
        }
    }
    public void IC(){
        setImage(settImage);
    }
}
