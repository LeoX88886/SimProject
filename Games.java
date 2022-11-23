import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Games superclass to create subclasses that increases points for whichever
 * Teams subclass interacts with them
 * 
 * @author Leo Xu
 * @version 1
 */
public abstract class Games extends Actor
{
    /**
     * Act - do whatever the Games wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Game console icon
    private GreenfootImage gameImage = new GreenfootImage("images/GamesIcon/game2.png");
    
    //instance of scores
    protected static int scoreOne = 0;
    protected static int scoreTwo = 0;
    protected static int scoreThree = 0;
    protected static int scoreFour = 0;
    protected static int scoreOneExtra;
    protected static int scoreTwoExtra;
    protected static int scoreThreeExtra;
    protected static int scoreFourExtra;
    protected static int dp = 0;
    
    //instance of score multipliers
    protected static int sMultiplier = 1;
    protected static int ogSMultiplier = 1;
    //sound for whenever team interacts with game
    protected GreenfootSound win = new GreenfootSound("sounds/gameWin.mp3");
    
    protected int deleteTimer;
    
    public Games()
    {
        //gameImage.scale(80,80);
        setImage(gameImage);
        win.setVolume(50);
        
        deleteTimer = -1;
        
    }
    
    public void act()
    {
        // Add your action code here.
        if(dp >= 3){
            dp = 0;
            Games.resetSMultiplier();
        }
        
        if (deleteTimer > 0){
            deleteTimer--;
        }
        if(deleteTimer == 0){
            /*int chance = Greenfoot.getRandomNumber(3);
            if (chance == 0)
            {
                scoreOne = scoreOne + scoreMultiplier;
            }*/
            
            if(isTouching(Team1.class))
            {
                scoreOne = scoreOne + (1 * sMultiplier);
                dp++;
                win.play();
                getWorld().removeObject(this);
                MyWorld.subK();
                return;
            }
            if(isTouching(Team2.class))
            {
                scoreTwo = scoreTwo + (1 * sMultiplier);
                dp++;
                win.play();
                getWorld().removeObject(this);
                MyWorld.subK();
                return;
            }
            if(isTouching(Team3.class))
            {
                scoreThree = scoreThree + (1 * sMultiplier);
                dp++;
                win.play();
                getWorld().removeObject(this);
                MyWorld.subK();
                return;
            }
            if(isTouching(Team4.class))
            {
                scoreFour = scoreFour + (1 * sMultiplier);
                dp++;
                win.play();
                getWorld().removeObject(this);
                MyWorld.subK();
                return;
            }
            
            //getWorld().removeObject(this);
            //MyWorld.subK();
            //MyWorld.getNum();
            return;
        }
        //record all the values of scoreOne-Four in extras
        scoreOneExtra = scoreOne;
        scoreTwoExtra = scoreTwo;
        scoreThreeExtra = scoreThree;
        scoreFourExtra = scoreFour;
    }
    
    public void deleteMe (){
        if (deleteTimer == -1){
            deleteTimer = 30;
        }
    }
    
    //getter and setter methods for setting and resetting the score multiplier
    public static void setSMultiplier(int num){
        sMultiplier = num;
    }
    public static void resetSMultiplier(){
        sMultiplier = ogSMultiplier;
    }
    
    //getter method for retrievely scores
    public static int getScoreOne()
    {
        return scoreOne;
    }
    public static int getScoreTwo()
    {
        return scoreTwo;
    }
    public static int getScoreThree()
    {
        return scoreThree;
    }
    public static int getScoreFour()
    {
        return scoreFour;
    }
    
    
    public static void resetScore()//resets the score for myWorld because it is static
    {
        scoreOne = 0;
        scoreTwo = 0;
        scoreThree = 0;
        scoreFour = 0;
    }
    
    //getter methods for retrievely extra scores
    public static int getScoreOneExtra()
    {
        return scoreOneExtra;
    }
    public static int getScoreTwoExtra()
    {
        return scoreTwoExtra;
    }
    public static int getScoreThreeExtra()
    {
        return scoreThreeExtra;
    }
    public static int getScoreFourExtra()
    {
        return scoreFourExtra;
    }
    
    //setter methods for setting the value of each score(mainly for SwapPoints)
    public static void setScoreOne(int value)
    {
        scoreOne = value;
    }
    public static void setScoreTwo(int value)
    {
        scoreTwo = value;
    }
    public static void setScoreThree(int value)
    {
        scoreThree = value;
    }
    public static void setScoreFour(int value)
    {
        scoreFour = value;
    }
}