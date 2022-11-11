import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Teams here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Teams extends Actor
{
    private int randomMove = 0;
    GreenfootImage img = getImage();
    Color wall = new Color(9,0,255);
    protected int directionR;
    protected int directionL;
    protected int directionU;
    protected int directionD;
    // 1 = right, -1 = left
    protected int s = 2;
    protected static int sUp = 5;
    protected int f = 1;
    public int setF()
    {
        //each team needs a random direction to start moving
        f = Greenfoot.getRandomNumber(3);//this is for the 4 directions. Random pulls 0,1,2,3.
        return f;
    }
    public void act()
    {
        Walk();
        GameCollison();
        WallCollison();
    }
    public void Walk()
    {
        //movement code
        if(f == 1){
            setLocation(getX()+s,getY());
        }else if(f == 2){
            setLocation(getX()-s,getY());
        }else if(f == 3){
            setLocation(getX(),getY()-s);
        }else if(f == 0){
            setLocation(getX(),getY()+s );
        }
        if(randomMove >= 150)
        {
            //will change direction after 225 milliseconds. 
            f = Greenfoot.getRandomNumber(3);
            randomMove = 0;
        }
        randomMove++;
    }
    public void WallCollison(){
        //color to detect when the team is touching the walls on the map.
        int shift = Greenfoot.getRandomNumber(3);
        Color right = (getWorld().getBackground().getColorAt(getX() + getImage().getWidth()/2,getY()));
        Color left = (getWorld().getBackground().getColorAt(getX() + getImage().getWidth()/-2,getY()));
        Color up = (getWorld().getBackground().getColorAt(getX(),getY() + getImage().getHeight()/-2));
        Color down = (getWorld().getBackground().getColorAt(getX(),getY() + getImage().getHeight()/2));
        //Wall bounce code
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
        if((right.getRed() == wall.getRed() && right.getGreen() == wall.getGreen() && right.getBlue() == wall.getBlue()))
        {
            //RIGHT
            shift = Greenfoot.getRandomNumber(2);
            if(shift == 1)
            {
                setLocation(getX()-8,getY());
                f = 2;
                shift = Greenfoot.getRandomNumber(2);
            }else if(shift == 2)
            {
                setLocation(getX()-8,getY());
                f = 3;
                shift = Greenfoot.getRandomNumber(2);
            }
            if(shift == 0)
            {
                setLocation(getX()-8,getY());
                f = 4;
                shift = Greenfoot.getRandomNumber(2);
            }
        }
        else if((left.getRed() == wall.getRed() && left.getGreen() == wall.getGreen() && left.getBlue() == wall.getBlue()))
        {
            //LEFT
            shift = Greenfoot.getRandomNumber(2);
            if(shift == 1)
            {
                setLocation(getX()+8,getY());
                f = 1;
                shift = Greenfoot.getRandomNumber(2);
            }else if(shift == 2)
            {
                setLocation(getX()+8,getY());
                f = 3;
                shift = Greenfoot.getRandomNumber(2);
            }else if(shift == 0)
            {
                setLocation(getX()+8,getY());
                f = 4;
                shift = Greenfoot.getRandomNumber(2);
            }
        }
        else if((up.getRed() == wall.getRed() && up.getGreen() == wall.getGreen() && up.getBlue() == wall.getBlue()))
        {
            //UP
            shift = Greenfoot.getRandomNumber(2);
            if(shift == 1)
            {
                setLocation(getX(),getY()+8);
                f = 1;
                shift = Greenfoot.getRandomNumber(2);
            }else if(shift == 2)
            {
                setLocation(getX(),getY()+8);
                f = 2;
                shift = Greenfoot.getRandomNumber(2);
            }else if(shift == 0)
            {
                setLocation(getX(),getY()+8);
                f = 4;
                shift = Greenfoot.getRandomNumber(2);
            }
        }
        else if((down.getRed() == wall.getRed() && down.getGreen() == wall.getGreen() && down.getBlue() == wall.getBlue()))
        {
            //DOWN
            shift = Greenfoot.getRandomNumber(2);
            if(shift == 1)
            {
                setLocation(getX(),getY()-8);
                f = 1;
                shift = Greenfoot.getRandomNumber(2);
            }else if(shift == 2)
            {
                setLocation(getX(),getY()-8);
                f = 2;
                shift = Greenfoot.getRandomNumber(2);
            }else if(shift == 0)
            {
                setLocation(getX(),getY()-8);
                f = 3;
                shift = Greenfoot.getRandomNumber(2);
            }
        }
    }
    public void GameCollison()
    {
        //code for when interacting with the games class.
        Games g = (Games)getOneIntersectingObject(Games.class);
        if (g != null){
            s = 0;//s = 0 means no movement
            g.deleteMe();
        }else{
            s = 2;
            //reset movemnet beck to normal.
        }
    }
    public void speedingUp(){
        s = sUp;
    }
    /**
    public static int get_sUp()
    {
        return sUp;
    }*/
}
