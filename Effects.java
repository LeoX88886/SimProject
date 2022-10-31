import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//hello its me
/**
 * Write a description of class Effects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Effects extends Actor
{
    /**
     * Act - do whatever the Effects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage effectImage = new GreenfootImage("images/coin.png");
    
    public Effects()
    {
        effectImage.scale(80,80);
        setImage(effectImage);

    }
    
    
    public void act()
    {
        // Add your action code here.
                
        
    }
}
