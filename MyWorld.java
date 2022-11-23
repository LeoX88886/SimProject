import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        
        
        //games loction
        /*addObject(g, 360, 270);

        addObject(g2, 460, 80);
        g2.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));

        addObject(g3, 760, 500);
        g3.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));

        addObject(g4, 460, 740);
        g4.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));*/

        //spawnGame();
        //spawnGame();
        //spawnGame();

        //effect location
        /**
        addObject(dp, 300, 100);
        addObject(su, 300, 200);
        addObject(sp, 300, 300);
        */
        
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

        //Teams.get_sUp();
        //showText("team 1 score: " + Games.getScoreOne(), 300, 50);
        //showText("team 2 score: " + Games.getScoreTwo(), 500, 50);
        

        //textbox updates for score
        widgetText1.update("team 1 score: " + Games.getScoreOne());
        
        widgetText2.update("team 2 score: " + Games.getScoreTwo());
        
        widgetText3.update("team 3 score: " + Games.getScoreThree());
        
        widgetText4.update("team 4 score: " + Games.getScoreFour());
        
        //if Games.grtscoreOne = 100
        // setWorld to winWorld
        
        
        /*if (Games.getScoreOne() >= scorTotal)
        {
            widgetText1.update("team 1 wins");
            widgetText2.update("team 1 wins");
            widgetText3.update("team 1 wins");
            widgetText4.update("team 1 wins");
            Greenfoot.stop();
            return;
        }
        if (Games.getScoreTwo() >= scorTotal)
        {
            widgetText1.update("team 2 wins");
            widgetText2.update("team 2 wins");
            widgetText3.update("team 2 wins");
            widgetText4.update("team 2 wins");
            Greenfoot.stop();
            return;
        }
        if (Games.getScoreThree() >= scorTotal)
        {
            widgetText1.update("team 3 wins");
            widgetText2.update("team 3 wins");
            widgetText3.update("team 3 wins");
            widgetText4.update("team 3 wins");
            Greenfoot.stop();
            return;
        }
        if (Games.getScoreFour() >= scorTotal)
        {
            widgetText1.update("team 4 wins");
            widgetText2.update("team 4 wins");
            widgetText3.update("team 4 wins");
            widgetText4.update("team 4 wins");
            Greenfoot.stop();
            return;
        }*/
        
        
        /*if (k < numGames)
        {
            spawnGame();
            k++;    
        }
        /**
        if (e < numEffects)
        {
            spawnEffect();
            e++;
        }*/
        
         if (k < 4)//respawns games
        {
            spawnGame();
            k++;    
        }
        if (e < 4)//respawns effects
        {
            spawnEffect();
            e++;
        }        
    }
    
    public void win()//go to WinScreen if the maxium score is hit
    {
        if (Games.getScoreOne() >= scorTotal)
        {
            WinScreen gameWorld = new WinScreen();
            Greenfoot.setWorld(gameWorld);
            
            WinText1 w1 = new WinText1();//show team 1 wins
            gameWorld.addObject(w1, 350, 80);
            return;
        }
        if (Games.getScoreTwo() >= scorTotal)
        {
            WinScreen gameWorld = new WinScreen();
            Greenfoot.setWorld(gameWorld);
            
            WinText2 w2 = new WinText2();//show team 2 wins
            gameWorld.addObject(w2, 350, 80);
            return;
        }
        if (Games.getScoreThree() >= scorTotal)
        {
            WinScreen gameWorld = new WinScreen();
            Greenfoot.setWorld(gameWorld);
            
            WinText3 w3 = new WinText3();//show team 3 wins
            gameWorld.addObject(w3, 350, 80);
            
            
            
            return;
        }
        if (Games.getScoreFour() >= scorTotal)
        {
            WinScreen gameWorld = new WinScreen();
            Greenfoot.setWorld(gameWorld);
            
            WinText4 w4 = new WinText4();//show team 4 wins
            gameWorld.addObject(w4, 350, 80);
            
            
            
            return;
        }
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
        numGames++;
        
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
            addObject(g3,980, 240);
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
        numEffects++;
        
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
            addObject(e1,700, 450);
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
            addObject(e1,550, 350);
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
            addObject(e2,980, 240);
        }
        if(ei == 11){
            addObject(e3,500, 640);
        }
        if(ei == 12){
            addObject(e1,700, 680);
        }
        if(ei == 13){
            addObject(e2,755, 540);
        }
        if(ei == 14){
            addObject(e3,250, 710);
        }
        if(ei == 15){
            addObject(e1,200, 250);
        }
    }
}
