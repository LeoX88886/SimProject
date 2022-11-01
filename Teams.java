import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Teams here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teams extends Actor
{
    /**
     * Act - do whatever the Teams wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage teamImage = new GreenfootImage("images/TeamsPic/GreenTeam.png");
    GreenfootImage img = getWorld().getBackground();
    public Teams()
    {
        teamImage.scale(30,30);
        setImage(teamImage);
    }
    public void act()
    {
        // Add your action code here.
        Walk();
    }
    public void Walk()
    {
        if (getX() >= 800){
               setLocation(getX()-50,getY()); 
        }else{
            setLocation(getX()+2,getY());
        }
        
    }
    /**
     * if(img.getColorAt(getX(),getY()) == color
     * {
     *     code
     * }
     */
}
