import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Where all the action takes place
 * 
 * In this simulation, you begin by being introduced to an animated background
 * with 3 buttons you can choose to press, PLAY, INSTRUCTIONS and SETTINGS.
 * 
 * Pressing the INSTRUCTIONS button will lead you to a new world where an image
 * filled with information of what the simulation can do will be displayed
 * 
 * Pressing the SETTINGS buttons will lead you to a world where you can edit
 * the values of the # of teams spawn, # of games spawned and score required
 * for a team to win
 * 
 * Pressing the START button will begin the simulation, leading you to MyWorld
 * 
 * MyWorld will instantly have 3-4 Effects, # of teams you selected(2 as default),
 * # of games spawned(3 as default) on a maze map
 * 
 * The teams will start randomly moving, applying perks/effects when interacting
 * with any subclass of Effects, and increasing their score by 1(2 if collected DoublePoints)
 * until a team wins by reaching the required score
 * 
 * All the Game and Team subclasses act the same, with the only difference being the image
 * 
 * Effects:
 * 
 * DoublePoints: This subclass doubles the amount of points earned by all teams x2
 * for the next 3 games the teams interact with, afterwards, it will reset and the teams
 * will have to interact with it again to gain the buff
 * 
 * SpeedUp: This subclass doubles the team that interacts with it for 5 seconds
 * 
 * SwapPoints: this subclass swaps the points of the current teams when interacted with
 * etc. Team 1 score: 5 -> Team 1 score: 3
 *      Team 2 score: 7 -> Team 2 score: 5
 *      Team 3 score: 1 -> Team 3 score: 7
 *      Team 4 score: 3 -> Team 4 score: 1
 *      
 * When a team reaches the score requirement, the simulation will end and a winning
 * screen will be displayed for whoever won, with a back button on the bottom left
 * if the user wants to start the simulation again, bring the user back to LobbyWorld
 * 
 * Known Errors:
 * (commented out): Music will repeat when a simulation is over and returns 
 * to the main screen
 * Effects spawn can sometimes overlap Games spawn
 * 
 * Credits:
 * 
 * Self-Made:
 * screenTitle.png
 * screenTitle2.png
 * Backarrow.png
 * backButton2.png
 * Everything in LobbyWorld1 folder
 * Everything in SettingButtons folder
 * Everything in WinScreen folder
 * 
 * Inspired:
 * MazeWorld.png inspired by (https://pacman.fandom.com/wiki/Pac-Man_Maze)
 * InstructionScreen.png inspired (https://www.freepik.com/free-photos-vectors/arcade-background)
 * SpeedUp.png, pointswap.png, pointup.png inspired by (https://battle-cats.fandom.com/wiki/Battle_Items)
 * 
 * Taken:
 * jenshin.png (https://steamcommunity.com/sharedfiles/filedetails/?id=1235691433)
 * AniBackground.gif (https://www.youtube.com/watch?v=z0uKqg7yi04)
 * BPVector.jpg (https://www.vecteezy.com/free-vector/gaming-background)
 * DigitalHexWall.png (https://www.freepik.com/free-photos-vectors/arcade-background)
 * button.mp3 (https://www.zapsplat.com/?s=button+click&post_type=music&sound-effect-category-id=)
 * NahidaMusic.mp3 (https://www.youtube.com/watch?v=byxB8G_k3DI)
 * DoublePoints.mp3 (https://pixabay.com/sound-effects/search/8-bit/?duration=0-30c)
 * gameWin.mp3, gameLose.wav, SpeedUp.mp3, SwapPoints.mp3 (https://freesound.org/people/LittleRobotSoundFactory/packs/16681/)(https://www.storyblocks.com/audio/search/8bit )
 * 
 * 
 * 
 * Did you notice where we put the class code and teacher name?
 * 
 * @author Leo Xu, Justin Sin, Tyson Pellatt
 * @version 1
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    protected static GreenfootImage background = new GreenfootImage ("images/MazeWorld.png");
    protected static int gameNum = 0;
    protected static int teamNum = 2;
    protected static int scorTotal = 4;
    protected int numGames = 3;
    protected int numEffects = 3;

    //team instance
    Team1 t1 = new Team1();
    Team2 t2 = new Team2();
    Team3 t3 = new Team3();
    Team4 t4 = new Team4();

    //game instance
    Game1 g = new Game1();
    Game2 g2 = new Game2();
    Game3 g3 = new Game3();
    Game4 g4 = new Game4();

    //effect instance
    DoublePoints dp = new DoublePoints();
    SpeedUp su = new SpeedUp();
    SwapPoints sp = new SwapPoints();

    //spawn instance
    private static int k = 0 ;
    private static int e = 0;
    
    //textbox instance
    private Font funFont, boringFont;
    
    private SuperTextBox widgetText1;
    private SuperTextBox widgetText2;
    private SuperTextBox widgetText3;
    private SuperTextBox widgetText4;
    
    private static GreenfootSound gameMusic;//gameplay msuic
    
    public static void setScorTotal(int num){
        scorTotal = num;
    }

    public MyWorld(int teamNum,int numGames, int scorTotal)
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 800, 1);
        
        setPaintOrder(Teams.class, Effects.class, Games.class);
        
        background = new GreenfootImage ("images/MazeWorld.png");
        background.scale(1024, 800);
        setBackground (background);


        this.teamNum = teamNum;
        this.numGames = numGames;
        this.scorTotal = scorTotal;
        Games.resetScore();
        
        //text box code
        
        funFont = new Font ("Comic Sans MS", false, false, 16);
        boringFont = new Font ("Times New Roman", false, false, 18);
        
        
        widgetText1 = new SuperTextBox ("Testing 123",  funFont, 200);
        addObject (widgetText1, 120, 20);
        
        widgetText2 = new SuperTextBox ("Testing 123",  funFont, 200);
        addObject (widgetText2, 320, 20);
        
        widgetText3 = new SuperTextBox ("Testing 123",  funFont, 200);
        addObject (widgetText3, 520, 20);
        
        widgetText4 = new SuperTextBox ("Testing 123",  funFont, 200);
        addObject (widgetText4, 720, 20);
        
        //for reseting game and effect spawn value
        k = 0;
        e = 0;
        
        
        gameMusic = new GreenfootSound("sounds/NahidaMusic.mp3");//instnace of gameplay music
        
        
        //teams location
        if(teamNum == 2)
        {
            addObject(t1, 72, 66);
            addObject(t2, 948, 734);
        } else if (teamNum == 3){
            addObject(t1, 72, 66);
            addObject(t2, 948, 66);
            addObject(t3, 512, 734);
        } else if (teamNum == 4){
            addObject(t1, 72, 66);
            addObject(t2, 948, 66);
            addObject(t3, 72, 734);
            addObject(t4, 948, 734);
        }
        
    }
    
    public int setTeams(int x)
    {
        teamNum = x;
        return teamNum;
    }
    /*public static int getNum()
    {
        return gameNum--;
    }*/

    public void act()
    {
        win();
        started();

        //Teams.get_sUp();
        //showText("team 1 score: " + Games.getScoreOne(), 300, 50);
        //showText("team 2 score: " + Games.getScoreTwo(), 500, 50);
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText(String.valueOf(m.getX()), 200, 200);
            showText(String.valueOf(m.getY()), 300, 200);
        }

        //textbox updates for score
        widgetText1.update("team 1 score: " + Games.getScoreOne());
        
        widgetText2.update("team 2 score: " + Games.getScoreTwo());
        
        widgetText3.update("team 3 score: " + Games.getScoreThree());
        
        widgetText4.update("team 4 score: " + Games.getScoreFour());
        
        if (k < numGames)//respawns games
        {
            spawnGame();    
        }
        if (e < numEffects)//respawns effects
        {
            spawnEffect();
        }        
    }
    
    public void win()//go to WinScreen if the maximum score is hit
    {
        if (Games.getScoreOne() >= scorTotal)
        {
            stopped();
            
            WinScreen gameWorld = new WinScreen();
            Greenfoot.setWorld(gameWorld);
            
            WinText1 w1 = new WinText1();//show team 1 wins
            gameWorld.addObject(w1, 350, 80);
            
            return;
        }
        if (Games.getScoreTwo() >= scorTotal)
        {
            stopped();
            
            WinScreen gameWorld = new WinScreen();
            Greenfoot.setWorld(gameWorld);
            
            WinText2 w2 = new WinText2();//show team 2 wins
            gameWorld.addObject(w2, 350, 80);
            
            return;
        }
        if (Games.getScoreThree() >= scorTotal)
        {
            stopped();
            
            WinScreen gameWorld = new WinScreen();
            Greenfoot.setWorld(gameWorld);
            
            WinText3 w3 = new WinText3();//show team 3 wins
            gameWorld.addObject(w3, 350, 80);
            
            return;
        }
        if (Games.getScoreFour() >= scorTotal)
        {
            stopped();
            
            WinScreen gameWorld = new WinScreen();
            Greenfoot.setWorld(gameWorld);
            
            WinText4 w4 = new WinText4();//show team 4 wins
            gameWorld.addObject(w4, 350, 80);
            
            return;
        }
    }
    
    public void started()//starts the theme sound when world starts
    {
        gameMusic.playLoop();
        gameMusic.setVolume(15);
    }
    
    public void stopped()// stops the theme sound when paused
    {
        gameMusic.stop();
    }
    
    public static void stopMusic()// stops the theme sound when paused
    {
        gameMusic.stop();
    }
    
    public static void subK()
    {
        k = k -1;
    }
    
    public static int getK()
    {
        return k;
    }
    
    public static void subE()
    {
        e = e -1;
    }
    
    public static int getE()
    {
        return e;
    }

    public void spawnGame()
    {
        Game1 g1 = new Game1();
        Game2 g2 = new Game2();
        Game3 g3 = new Game3();
        Game4 g4 = new Game4();
        int gi = Greenfoot.getRandomNumber(15);
        int GameImg = Greenfoot.getRandomNumber(4)+1;
        k++;
        
        if(gi == 0)
        {
            addObject(g1, 400, 200);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 1)
        {
            addObject(g2, 600, 650);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 2)
        {
            addObject(g3, 200, 350);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 3)
        {
            addObject(g4,400, 450);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 4)
        {
            addObject(g1,575, 350);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 5)
        {
            addObject(g2,200, 450);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 6)
        {
            addObject(g3,550, 150);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 7)
        {
            addObject(g4,605, 325);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 8){
            addObject(g1,800, 440);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 9){
            addObject(g2,750, 140);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 10){
            addObject(g3,940, 210);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 11){
            addObject(g4,550, 640);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 12){
            addObject(g1,300, 610);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 13){
            addObject(g2,825, 540);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 14){
            addObject(g3,250, 710);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
        if(gi == 15){
            addObject(g4,200, 140);
            g1.setImage(new GreenfootImage("images/GamesIcon/game"+GameImg+".png"));
        }
    }
    public void spawnEffect()
    {
        DoublePoints e1 = new DoublePoints();
        SpeedUp e2 = new SpeedUp();
        SwapPoints e3 = new SwapPoints();
        int ei = Greenfoot.getRandomNumber(15);
        e++;
        
        if(ei == 0)
        {
            addObject(e1, 450, 270);
        }
        if(ei == 1)
        {
            addObject(e2, 300, 650);
        }
        if(ei == 2)
        {
            addObject(e3, 230, 650);
        }
        if(ei == 3)
        {
            addObject(e1,600, 450);
        }
        if(ei == 4)
        {
            addObject(e2,575, 650);
        }
        if(ei == 5)
        {
            addObject(e3,300, 650);
        }
        if(ei == 6)
        {
            addObject(e1,580, 350);
        }
        if(ei == 7)
        {
            addObject(e2,675, 325);
        }
        if(ei == 8){
            addObject(e3,720, 440);
        }
        if(ei == 9){
            addObject(e1,780, 170);
        }
        if(ei == 10){
            addObject(e2,960, 240);
        }
        if(ei == 11){
            addObject(e3,500, 580);
        }
        if(ei == 12){
            addObject(e1,700, 680);
        }
        if(ei == 13){
            addObject(e2,755, 500);
        }
        if(ei == 14){
            addObject(e3,250, 710);
        }
        if(ei == 15){
            addObject(e1,200, 250);
        }
    }
}
