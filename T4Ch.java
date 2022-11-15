import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class T4Ch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class T4Ch extends Actor
{
    /**
     * Act - do whatever the T4Ch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected GreenfootImage Chosen = new GreenfootImage("images/SettingButtons/Choose4.png");
    protected GreenfootImage settImage = new GreenfootImage("images/SettingButtons/4Team's.png");
    public T4Ch()
    {
        setImage(settImage);
    }
    public void act()
    {
        T2Ch t2 = new T2Ch();
        T3Ch t3 = new T3Ch();
        if (Greenfoot.mouseClicked(this) && getImage().equals(settImage)) 
        {
            MyWorld.setTeams(2);
            setImage(Chosen);
            //t2.IC();
            //t3.IC();
        }
        //IC();
    }
    /**
    public void IC(){
        setImage(settImage);
    }*/
}
