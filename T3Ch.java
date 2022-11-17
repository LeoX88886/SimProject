import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class T3Ch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class T3Ch extends Actor
{
    /**
     * Act - do whatever the T3Ch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected GreenfootImage Chosen = new GreenfootImage("images/SettingButtons/Choose3.png");
    protected GreenfootImage settImage = new GreenfootImage("images/SettingButtons/3Team's.png");
    public T3Ch()
    {
        setImage(settImage);
    }
    public void act()
    {
        T2Ch t2 = new T2Ch();
        T4Ch t4 = new T4Ch();
        if (Greenfoot.mouseClicked(this) && getImage().equals(settImage)) 
        {
            MyWorld.setTeams(2);
            setImage(Chosen);
        }
        //SettingsWorld.IC();
    }
    public void IC(){
        setImage(settImage);
    }
}
