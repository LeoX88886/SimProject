import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Teams here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Teams extends Actor
{
    /**
     * Act - do whatever the Teams wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int randomMove = 0;
    
    GreenfootImage img = getImage();
    Color wall = new Color(9,0,255);
    protected int directionR;// 1 = right, -1 = left
    protected int directionL;
    protected int directionU;
    protected int directionD;
    protected int s = 2;
    protected int f = 1;
    private int arcade = 20;
    public int setF()
    {
        f = Greenfoot.getRandomNumber(4);
        return f;
    }
    public void act()
    {
        // Add your action code here.
        Walk();
        GameCollison();
        WallCollison();
    }
    public void Walk()
    {
        if(f == 1){
            setLocation(getX()+s,getY());
        }else if(f == 2){
            setLocation(getX()-s,getY());
        }else if(f == 3){
            setLocation(getX(),getY()-s);
        }else if(f == 4){
            setLocation(getX(),getY()+s);
        }
        if(randomMove >= 225)
        {
            f = Greenfoot.getRandomNumber(4);
            randomMove = 0;
        }
        randomMove++;
    }
    public void WallCollison(){
        directionR = 1;
        directionL = -1;
        directionU = -1;
        directionD = 1;
        
        int shift = Greenfoot.getRandomNumber(3);
        Color right = (getWorld().getBackground().getColorAt(getX() + getImage().getWidth()/2,getY()));
        Color left = (getWorld().getBackground().getColorAt(getX() + getImage().getWidth()/-2,getY()));
        Color up = (getWorld().getBackground().getColorAt(getX(),getY() + getImage().getHeight()/-2));
        Color down = (getWorld().getBackground().getColorAt(getX(),getY() + getImage().getHeight()/2));
        if(getY() == 56)
        {
            f = 4;
            setLocation(getX(),getY()+4);
        }else if(getX() == 60){
            f = 2;
            setLocation(getX()+4,getY());
        }
        else if(getY() == 745){
            f = 3;
            setLocation(getX(),getY()-4);
        }
        else if(getX() == 962){
            f = 1;
            setLocation(getX()-4,getY());
        }
        if((right.getRed() == wall.getRed() && right.getGreen() == wall.getGreen() && right.getBlue() == wall.getBlue())&& directionR == 1)
        {
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                f = 2;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX()-7,getY());
            }else if(shift == 2)
            {
                f = 3;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX()-7,getY());
            }
            if(shift == 3)
            {
                f = 4;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX()-7,getY());
            }
        }
        else if((left.getRed() == wall.getRed() && left.getGreen() == wall.getGreen() && left.getBlue() == wall.getBlue()) && directionL == -1)
        {
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                f = 1;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX()+7,getY());
            }else if(shift == 2)
            {
                f = 3;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX()+7,getY());
            }
            if(shift == 3)
            {
                f = 4;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX()+7,getY());
            }
        }
        else if((up.getRed() == wall.getRed() && up.getGreen() == wall.getGreen() && up.getBlue() == wall.getBlue()) && directionU == -1)
        {
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                f = 1;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX(),getY()+7);
            }else if(shift == 2)
            {
                f = 2;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX(),getY()+7);
            }
            if(shift == 3)
            {
                f = 4;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX(),getY()+7);
            }
        }
        else if((down.getRed() == wall.getRed() && down.getGreen() == wall.getGreen() && down.getBlue() == wall.getBlue()) && directionD == 1)
        {
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                f = 1;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX(),getY()-7);
            }else if(shift == 2)
            {
                f = 2;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX(),getY()-7);
            }
            if(shift == 3)
            {
                f = 3;
                shift = Greenfoot.getRandomNumber(3);
                setLocation(getX(),getY()-7);
            }
        }
    }
    public void GameCollison(){
        if(isTouching(Games.class))
        {
            if(arcade > 0){
                s = 0;
                arcade--;
                removeTouching(Games.class);
            }
        }
        arcade = 20;
        s = 2;
    }
}
