import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LobbyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LobbyWorld extends World
{
    /**
     * Constructor for objects of class LobbyWorld.
     * 
     */
    //lobby image and the animation background
    private static GreenfootImage background1 = new GreenfootImage ("images/jenshin.png");
    private static GifImage background = new GifImage("aniBackground.gif");

    private int numTeams;
    private int numGames;
    private int scorTotal = 3;
    
    /**
    private int scor1;
    private int scor2;
    private int scor3;
    private int scor4;
    */
   
    PlayButton pb = new PlayButton();//play button
    SettingButton sb = new SettingButton();// setting button
    InstructionButton ib = new InstructionButton(); //intruction button
    ScreenTitle st = new ScreenTitle(); //Title "Arcade Siumlation
    ScreenTitleTwo stt = new ScreenTitleTwo();// Title groups number, class, teachers full name

    public LobbyWorld (int numTeams, int numGames, int scorTotal){
        this(); // regular no-parameter constructor
        this.numTeams = numTeams;
        this.numGames = numGames;
        this.scorTotal = scorTotal;
        
        MyWorld.setScorTotal(this.scorTotal);
    }
    
    public LobbyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 

        numTeams = 2;
        numGames = 3;
        scorTotal = 4;
        
        background1 = new GreenfootImage ("images/jenshin.png");
        
        background.resume();//resume the animation when the world gets recalled from the WinScreen
        setBackground(background1);
    }

    public void act()
    {
        setBackground(background.getCurrentImage());//start the animation background  
        
        //adding the objects to the animation background
        addObject(pb, 210, 300);
        addObject(sb, 360, 300);
        addObject(ib, 280, 360);
        addObject(st, 400, 170);
        addObject(stt, 60, 240);

        if (Greenfoot.mouseClicked(pb))// go to myWorld when playbutton is pressed
        {
            Greenfoot.setWorld(new MyWorld(numTeams,numGames,scorTotal));
            
            background.pause();//stops the aniamtion
        }
    }
}
