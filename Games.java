import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Games here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Games extends Actor
{
    /**
     * Act - do whatever the Games wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Game console icon
    private GreenfootImage gameImage = new GreenfootImage("images/GamesIcon/game2.png");
    
    //instance of scores
    private static int scoreOne;
    private static int scoreTwo;
    
    
    public Games()
    {
        //gameImage.scale(80,80);
        setImage(gameImage);
        
        scoreOne = 0;
        scoreTwo = 0;
        
        

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
    }
    
    
    public static int getScoreOne()
    {
        return scoreOne;
    }
    
    public static int getScoreTwo()
    {
        return scoreTwo;
    }
    
    
    
}
