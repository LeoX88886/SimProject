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
    PlayButton pb = new PlayButton();
    SettingButton sb = new SettingButton();
    InstructionButton ib = new InstructionButton();
    ScreenTitle st = new ScreenTitle();
    ScreenTitleTwo stt = new ScreenTitleTwo();

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
        /*addObject(pb, 210, 300);
        addObject(sb, 360, 300);
        addObject(ib, 280, 360);
        addObject(st, 400, 170);*/

        numTeams = 2;
        numGames = 3;
        scorTotal = 4;
        background1 = new GreenfootImage ("images/jenshin.png");
        
        background.resume(); 
        setBackground(background1);
        
        

        
    }

    public void act()
    {
        setBackground(background.getCurrentImage());   
        
        addObject(pb, 210, 300);
        addObject(sb, 360, 300);
        addObject(ib, 280, 360);
        addObject(st, 400, 170);
        addObject(stt, 60, 240);
        
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText("X: " + String.valueOf(m.getX()), 200, 200);
            showText("Y: " + String.valueOf(m.getY()), 300, 200);
        }

        if (Greenfoot.mouseClicked(pb)) 
        {
            Greenfoot.setWorld(new MyWorld(numTeams,numGames,scorTotal));
            
            background.pause(); 
        }
    }
}
