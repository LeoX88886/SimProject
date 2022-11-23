import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The "home screen" of this simulation
 * Contains the buttons to access MyWorld(Simulation), SettingsWorld(settings)
 * and InstructionWorld(instructions)
 * 
 * @author Leo Xu, Justin Sin, Tyson Pellatt
 * @version 1
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
    private int playMusic;
   
    PlayButton pb = new PlayButton();//play button
    SettingButton sb = new SettingButton();// setting button
    InstructionButton ib = new InstructionButton(); //intruction button
    ScreenTitle st = new ScreenTitle(); //Title "Arcade Siumlation
    ScreenTitleTwo stt = new ScreenTitleTwo();// Title groups number, class, teachers full name
    //sounds for button press
    private GreenfootSound button = new GreenfootSound("sounds/button.mp3");
    private GreenfootSound music = new GreenfootSound("sounds/NahidaMusic.mp3");
    
    private static GreenfootSound themeSound;
    
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
        /* Keeps repeating
        music.setVolume(15);
        if(playMusic == 0){
            music.play();
        }
        playMusic++;
        */
        
        themeSound = new GreenfootSound("sounds/NahidaMusic.mp3"); //instance of ambient sound effect

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
        
        started();//play theme song
        
        //adding the objects to the animation background
        addObject(pb, 210, 300);
        addObject(sb, 360, 300);
        addObject(ib, 280, 360);
        addObject(st, 400, 170);
        addObject(stt, 60, 240);

        if (Greenfoot.mouseClicked(pb))// go to myWorld when playbutton is pressed
        {
            /* Creates a weird noise when pressed(removed)
            button.setVolume(50);
            button.play();
            */
            Greenfoot.setWorld(new MyWorld(numTeams,numGames,scorTotal));
            
            background.pause();//stops the animation
            stopped(); //stop music
        }
    }
    
    public void started()//starts the theme sound when world starts
    {
        themeSound.playLoop();
        themeSound.setVolume(50);
    }
    
    public void stopped()// stops the theme sound when paused
    {
        themeSound.stop();
    }
    
    public static void stopMusic()// stops the theme sound when paused
    {
        themeSound.stop();
    }
}
