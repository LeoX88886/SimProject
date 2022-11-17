import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class T3Ch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the T3Ch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int value;
    protected GreenfootImage unselected; //= new GreenfootImage("images/SettingButtons/Choose3.png");
    protected GreenfootImage selected; //= new GreenfootImage("images/SettingButtons/3Team's.png");
    public Button(int value, GreenfootImage unselected, GreenfootImage selected)
    {
        this.value = value;
        this.unselected = unselected;
        this.selected = selected;
        setImage(unselected);
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void switchImage(){
        if(getImage() == unselected){
            setImage(selected);
        } else {
            setImage(unselected);
        }
    }
    
    public void unselect(){
        setImage(unselected);
    }
    public void select(){
        setImage(selected);
    }
    public void act()
    {
        
    }
}
