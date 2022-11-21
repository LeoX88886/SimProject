import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Games here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    protected static int scoreOneExtra;
    protected static int scoreTwoExtra;
    
    private int deleteTimer;
    
    private static int scoreMultiplier = 5;
    
    
    public Games()
    {
        //gameImage.scale(80,80);
        setImage(gameImage);
        
        
        scoreMultiplier = 5;
        
        scoreOneExtra = 0;
        scoreTwoExtra = 0;
        
        deleteTimer = -1;
        
    }
    
    public void act()
    {
        // Add your action code here.
        
        if(Greenfoot.isKeyDown("1"))
        {
            scoreOne++;
        }
        
        if(Greenfoot.isKeyDown("2"))
        {
            scoreTwo++;
        }
            
        if(Greenfoot.isKeyDown("3"))
        {
            scoreOne--;
        }
        
        if(Greenfoot.isKeyDown("4"))
        {
            scoreTwo--;
        }
        
        if(isTouching(MainCharacter.class))
        {
            int chance = Greenfoot.getRandomNumber(3);
            
            if (chance == 0)
            {
                scoreOne = scoreOne + scoreMultiplier;
            }
        }
        
        
        
        if(isTouching(Team1.class))
        {
            int chance = Greenfoot.getRandomNumber(3);
            
            if (chance == 0)
            {
                scoreOne = scoreOne + scoreMultiplier;
            }
            return;
        }
        
        if(isTouching(Team2.class))
        {
            int chance = Greenfoot.getRandomNumber(3);
            
            if (chance == 0)
            {
                scoreTwo = scoreTwo + scoreMultiplier;
            }
            return;
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
            
            getWorld().removeObject(this);
            MyWorld.subK();
            
            
            //MyWorld.getNum();
            return;
        }
        
        //scoreOneExtra = scoreOne;
        //scoreTwoExtra = scoreTwo;
    }
    
    public void deleteMe (){
        if (deleteTimer == -1){
            deleteTimer = 30;
        }
        
        
    }
    
    
    public static int getScoreOne()
    {
        return scoreOne;
    }
    
    public static int getScoreTwo()
    {
        return scoreTwo;
    }
    
    public static int getScoreOneExtra()
    {
        return scoreOneExtra;
    }
    
    public static int getScoreTwoExtra()
    {
        return scoreTwoExtra;
    }
    
    public static void setScoreOne(int value)
    {
        scoreOne = value;
    }
    
    public static void setScoreTwo(int value)
    {
        scoreTwo = value;
    }
}