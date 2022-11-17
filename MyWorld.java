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
    protected int teamNum = 2;

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

    private static int k = 3;

    public MyWorld(int teamNum)
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 800, 1);

        setPaintOrder(MainCharacter.class, Teams.class, Games.class, Effects.class);

        background = new GreenfootImage ("images/MazeWorld.png");
        background.scale(1024, 800);
        setBackground (background);

        MainCharacter main = new MainCharacter();//spawn MainCharater
        addObject(main, 200, 200);

        this.teamNum = teamNum;
        
        //teams location
        if(teamNum == 2)
        {
            addObject(t1, 72, 66);
            addObject(t2, 948, 66);
        } else if (teamNum == 3){
            addObject(t1, 72, 66);
            addObject(t2, 948, 66);
            addObject(t3, 72, 734);
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

        spawnGame();
        spawnGame();
        spawnGame();

        //effect location
        addObject(dp, 75, 100);
        addObject(su, 75, 200);
        addObject(sp, 75, 300);
        
        
    }
    public int setTeams(int x)
    {
        teamNum = x;
        return teamNum;
    }
    public static int getNum()
    {
        return gameNum--;
    }

    public void act()
    {
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText("X: " + String.valueOf(m.getX()), 200, 200);
            showText("Y: " + String.valueOf(m.getY()), 300, 200);
        }

        //Teams.get_sUp();
        showText("team 1 score: " + Games.getScoreOne(), 300, 50);
        showText("team 2 score: " + Games.getScoreTwo(), 500, 50);
        

        if (k < 3)
        {
            spawnGame();
            
            k++;
            
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
    

    public void spawnGame()
    {
        Game1 g1 = new Game1();
        Game2 g2 = new Game2();
        Game3 g3 = new Game3();
        Game4 g4 = new Game4();
        int gi = Greenfoot.getRandomNumber(7);
        int GameImg = Greenfoot.getRandomNumber(4);
        gameNum++;
        
        if(gi == 0)
        {
            addObject(g1, 400, 200);
            if(GameImg ==0)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game.png"));
            }
            if(GameImg ==1)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game2.png"));
            }
            if(GameImg ==2)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));
            }
            if(GameImg ==3)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));
            }
            if(GameImg ==4)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));
            }
        }
        if(gi == 1)
        {
            addObject(g2, 600, 650);
            if(GameImg ==0)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game.png"));
            }
            if(GameImg ==1)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game2.png"));
            }
            if(GameImg ==2)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));
            }
            if(GameImg ==3)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));
            }
            if(GameImg ==4)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));
            }
        }
        if(gi == 2)
        {
            addObject(g3, 200, 350);
            if(GameImg ==0)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game.png"));
            }
            if(GameImg ==1)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game2.png"));
            }
            if(GameImg ==2)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));
            }
            if(GameImg ==3)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));
            }
            if(GameImg ==4)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));
            }
        }
        if(gi == 3)
        {
            addObject(g4,400, 450);
            if(GameImg ==0)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game.png"));
            }
            if(GameImg ==1)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game2.png"));
            }
            if(GameImg ==2)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));
            }
            if(GameImg ==3)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));
            }
            if(GameImg ==4)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));
            }
        }
        if(gi == 4)
        {
            addObject(g1,575, 350);
            if(GameImg ==0)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game.png"));
            }
            if(GameImg ==1)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game2.png"));
            }
            if(GameImg ==2)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));
            }
            if(GameImg ==3)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));
            }
            if(GameImg ==4)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));
            }
        }
        if(gi == 5)
        {
            addObject(g2,200, 450);
            if(GameImg ==0)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game.png"));
            }
            if(GameImg ==1)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game2.png"));
            }
            if(GameImg ==2)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));
            }
            if(GameImg ==3)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));
            }
            if(GameImg ==4)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));
            }
        }
        if(gi == 6)
        {
            addObject(g3,550, 150);
            if(GameImg ==0)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game.png"));
            }
            if(GameImg ==1)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game2.png"));
            }
            if(GameImg ==2)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));
            }
            if(GameImg ==3)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));
            }
            if(GameImg ==4)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));
            }
        }
        if(gi == 7)
        {
            addObject(g4,605, 325);
            if(GameImg ==0)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game.png"));
            }
            if(GameImg ==1)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game2.png"));
            }
            if(GameImg ==2)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));
            }
            if(GameImg ==3)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));
            }
            if(GameImg ==4)
            {
                g1.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));
            }
        }
    }
}
