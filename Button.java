import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The button class is used to create the values that can be changes when creating the simmulation.
 * @param value          The value of the button
 * @param inselected     The image displayed when value is unselected
 * @param selected       The image when value is selected
 * 
 * @author Tyson Darius Pellatt, Jordan Cohen 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    protected int value;
    protected GreenfootImage unselected; //= new GreenfootImage("images/SettingButtons/Choose3.png");
    protected GreenfootImage selected; //= new GreenfootImage("images/SettingButtons/3Team's.png");
    private GreenfootSound button = new GreenfootSound("sounds/button.mp3");
    
    public Button(int value, GreenfootImage unselected, GreenfootImage selected)
    {
        //value is how much is being changed (ex. 2 teams being changed to 4 teams), and a selected & unselected picture
        this.value = value;
        this.unselected = unselected;
        this.selected = selected;
        setImage(unselected);
    }
    
    public int getValue()
    {
        return value;
        //returns the value of the button
    }
    
    public void switchImage(){
        if(getImage() == unselected){
            setImage(selected);
        } else {
            setImage(unselected);
        }
        //changes the chosen image with each other
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
