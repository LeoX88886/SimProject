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
    GreenfootImage img = getImage();
    Color wall = new Color(9,0,255);
    protected int directionR;// 1 = right, -1 = left
    protected int directionL;
    protected int speed;
    //Teams t = (Teams)getOneObjectAtOffset(0,0,Teams.class);
    public Teams()
    {
        teamImage.scale(30,30);
        setImage(teamImage);
    }
    //public void getImage()
    //{
    //    return teamImage;
    // }
    public void act()
    {
        // Add your action code here.
        Walk();
    }
    public void Walk()
    {
        directionR = 1;
        int f = 1;
        directionL = -1;
        speed = 1;
        int shift = Greenfoot.getRandomNumber(3);
        
        Color right = (getWorld().getBackground().getColorAt(getX() + getImage().getWidth()/2,getY()));
        Color left = (getWorld().getBackground().getColorAt(getX() + getImage().getWidth()/-2,getY()));
        Color up = (getWorld().getBackground().getColorAt(getX(),getY() + getImage().getHeight()/-2));
        Color down = (getWorld().getBackground().getColorAt(getX(),getY() + getImage().getHeight()/2));
        if((right.getRed() == wall.getRed() && right.getGreen() == wall.getGreen() && right.getBlue() == wall.getBlue())&& directionR == 1)
        {
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                f = 2;
                //shift = Greenfoot.getRandomNumber (3);
            }else if(shift == 2)
            {
                f = 3;
                //shift = Greenfoot.getRandomNumber (3);
            }
            if(shift == 3)
            {
                f = 4;
                //shift = Greenfoot.getRandomNumber (3);
            }
        }
        else if((left.getRed() == wall.getRed() && left.getGreen() == wall.getGreen() && left.getBlue() == wall.getBlue()) && directionL == -1)
        {
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                f = 1;
                //shift = Greenfoot.getRandomNumber (3);
            }else if(shift == 2)
            {
                f = 3;
                //shift = Greenfoot.getRandomNumber (3);
            }
            if(shift == 3)
            {
                f = 4;
                //shift = Greenfoot.getRandomNumber (3);
            }
        }
        else if((up.getRed() == wall.getRed() && up.getGreen() == wall.getGreen() && up.getBlue() == wall.getBlue()) && directionL == -1)
        {
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                f = 1;
                //shift = Greenfoot.getRandomNumber (3);
            }else if(shift == 2)
            {
                f = 2;
                //shift = Greenfoot.getRandomNumber (3);
            }
            if(shift == 3)
            {
                f = 4;
                //shift = Greenfoot.getRandomNumber (3);
            }
        }
        else if((down.getRed() == wall.getRed() && down.getGreen() == wall.getGreen() && down.getBlue() == wall.getBlue()) && directionR == 1)
        {
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                f = 1;
                //shift = Greenfoot.getRandomNumber (3);
            }else if(shift == 2)
            {
                f = 2;
                //shift = Greenfoot.getRandomNumber (3);
            }
            if(shift == 3)
            {
                f = 3;
                //shift = Greenfoot.getRandomNumber (3);
            }
        }
        else{
            //move(speed * direction);
            if(f == 1)
            {
                setLocation(getX()+1,getY());
            }else if(f == 2)
            {
                setLocation(getX()-1,getY());
            }else if(f == 3)
            {
                setLocation(getX(),getY()-1);
            }else if(f == 4)
            {
                setLocation(getX(),getY()+1);
            }
            //setLocation(getX()+1,getY());
        }
    }
    /**
     * if(img.getColorAt(getX(),getY()) == color
     * {
     *     code
     * }
     */
}
