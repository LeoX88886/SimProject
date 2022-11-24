import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Teams calss is the main actor within the simulation that interacts with differnt actors.
 * randomMove is the timer for the teams to change their movement direction when it reaches a certain number. wall is so the team can see if it 
 * is hitting a wall within the background of the play area.The s & sUp variables are for how fast the teams are moving and when it speeds up.
 * f is for the direction the team moves (1 is right, 2 is left, 3 is up, and 4 is down).
 * 
 * 
 * @author Tyson Darius Pellatt, Justin Sin(Effects)
 * @version 1
 */
public abstract class Teams extends Actor
{
    //The timer to change the direction of the team 
    private int randomMove = 0;
    
    //the team needs to know the color of the wals in 
    //the map so they can bounce of of them.
    Color wall = new Color(9,0,255);
    
    //speed variables
    protected int s = 2;
    protected int sUp = 4;
    protected boolean speeding = false;
    protected GreenfootSound speedup = new GreenfootSound("sounds/SpeedUp.mp3");
    
    //the direction the team moves (1 = right, 2 = left, 3 = up, 4 = down)
    protected int f = 1;
    
    //score adjustments
    private static int scoreMultiplier = 1;
    private static int ogMultiplier = 1;
    private static boolean doublePoints = false;
    
    //timer variable for speedup
    private SimpleTimer timer = new SimpleTimer();

    public int setF()
    {
        //each team needs a random direction to start moving
        f = Greenfoot.getRandomNumber(4)+1;//this is for the 4 directions.
        return f;
    }
    public void act()
    {
        Walk();
        GameCollison();
        WallCollison();
        
        checkHitSpeedUp();
        
        //speedup/slowdown when interacting with SpeedUp effects
        if(timer.millisElapsed() > 5000){
            returnOriginalSpeed();
        }
    }
    /**
     * Allows the Teams subclasses to move around the world
     */
    public void Walk()
    {
        //movement code
        if(f == 1){
            setLocation(getX()+s,getY());
        }else if(f == 2){
            setLocation(getX()-s,getY());
        }else if(f == 3){
            setLocation(getX(),getY()-s);
        }else if(f == 4){
            setLocation(getX(),getY()+s );
        }
        if(randomMove >= 150)
        {
            //will change direction after 225 milliseconds. 
            f = Greenfoot.getRandomNumber(4)+1;
            randomMove = 0;
        }
        randomMove++;
    }
    /**
     * method to make sure that Teams subclasses does not walk into walls
     */
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
        //movement
        if((right.getRed() == wall.getRed() && right.getGreen() == wall.getGreen() && right.getBlue() == wall.getBlue()))
        {
            //RIGHT
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                setLocation(getX()-8,getY());
                f = 2;
                shift = Greenfoot.getRandomNumber(3);
            }else if(shift == 2)
            {
                setLocation(getX()-8,getY());
                f = 3;
                shift = Greenfoot.getRandomNumber(3);
            }
            else if (shift == 0){
                setLocation(getX()-8,getY());
                f = 4;
                shift = Greenfoot.getRandomNumber(3);
            }
        }
        else if((left.getRed() == wall.getRed() && left.getGreen() == wall.getGreen() && left.getBlue() == wall.getBlue()))
        {
            //LEFT
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                setLocation(getX()+8,getY());
                f = 1;
                shift = Greenfoot.getRandomNumber(3);
            }else if(shift == 2)
            {
                setLocation(getX()+8,getY());
                f = 3;
                shift = Greenfoot.getRandomNumber(3);
            }else if(shift == 0)
            {
                setLocation(getX()+8,getY());
                f = 4;
                shift = Greenfoot.getRandomNumber(3);
            }
        }
        else if((up.getRed() == wall.getRed() && up.getGreen() == wall.getGreen() && up.getBlue() == wall.getBlue()))
        {
            //UP
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                setLocation(getX(),getY()+8);
                f = 1;
                shift = Greenfoot.getRandomNumber(3);
            }else if(shift == 2)
            {
                setLocation(getX(),getY()+8);
                f = 2;
                shift = Greenfoot.getRandomNumber(3);
            }else if(shift == 0)
            {
                setLocation(getX(),getY()+8);
                f = 4;
                shift = Greenfoot.getRandomNumber(3);
            }
        }
        else if((down.getRed() == wall.getRed() && down.getGreen() == wall.getGreen() && down.getBlue() == wall.getBlue()))
        {
            //DOWN
            shift = Greenfoot.getRandomNumber(3);
            if(shift == 1)
            {
                setLocation(getX(),getY()-8);
                f = 1;
                shift = Greenfoot.getRandomNumber(3);
            }else if(shift == 2)
            {
                setLocation(getX(),getY()-8);
                f = 2;
                shift = Greenfoot.getRandomNumber(3);
            }else if(shift == 0)
            {
                setLocation(getX(),getY()-8);
                f = 3;
                shift = Greenfoot.getRandomNumber(3);
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
            if(speeding == true){
                //reset movemnet beck to SpeedUp speed.
                s = sUp;
            }
            if(speeding == false){
                //reset movemnet beck to normal.
                s = 2;
            }
        }
    }
    
    /**
     * if Teams subclass is touching SpeedUp class from Effects, plays a sound, removes the SpeedUp from world and
     * doubles the speed of the subclass for 5 seconds
     * (Check SpeedUp for more details on why this is here)
     */
    public boolean checkHitSpeedUp(){
        //code to see if the team is touching a speed up. it didnt work int he actual speedUp actor for some reason
        SpeedUp su = (SpeedUp)getOneObjectAtOffset(0, 0, SpeedUp.class);
        if(su != null){
            timer.mark();
            speedup.setVolume(30);
            speedup.play();
            MyWorld.subK();
            su.removeThis();
            speedingUp();
            return true;
        }
        return false;
    }
    
    /**
     * Method to change speed into SpeedUp speed
     */
    public void speedingUp(){
        //code to change the speed to the speed up version
        s = sUp;
        speeding = true;
    }
    
    /**
     * method to return speed into it's original state(2)
     */
    public void returnOriginalSpeed(){
        //code to change the added speed back to normal
        s = 2;
        speeding = false;
    }
}