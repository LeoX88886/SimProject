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
    protected int gameNum = 0;
    
    
    
    //team instance
    Team1 t1 = new Team1();
    Team2 t2 = new Team2();
    Team3 t3 = new Team3();
    Team4 t4 = new Team4();
    
    //game instance
    Games g = new Games();
    Games g2 = new Games();
    Games g3 = new Games();
    Games g4 = new Games();
    
    //effect instance
    DoublePoints dp = new DoublePoints();
    SpeedUp su = new SpeedUp();
    SwapPoints sp = new SwapPoints();
    
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 800, 1);
        
        setPaintOrder(MainCharacter.class, Teams.class, Games.class, Effects.class);

        background = new GreenfootImage ("images/MazeWorld.png");
        background.scale(1024, 800);
        setBackground (background);
        
        MainCharacter main = new MainCharacter();//spawn MainCharater
        addObject(main, 200, 200);
        
        
        
        
        
        //teams location
        addObject(t1, 72, 66);
        addObject(t2, 948, 66);
        addObject(t3, 72, 734);
        addObject(t4, 948, 734);
        
        //games loction
        /*addObject(g, 360, 270);
        
        addObject(g2, 460, 80);
        g2.setImage(new GreenfootImage ("images/GamesIcon/game5.png"));
        
        addObject(g3, 760, 500);
        g3.setImage(new GreenfootImage ("images/GamesIcon/game3.png"));
    
        addObject(g4, 460, 740);
        g4.setImage(new GreenfootImage ("images/GamesIcon/game4.png"));*/
        
        
        for (int i = 0; i < 3; i++)
        {
            spawnGame();
            
        }
        
        //effect location
        addObject(dp, 75, 100);
        addObject(su, 75, 200);
        addObject(sp, 75, 300);
        
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
        
        
        
    }
    public void spawnGame()
    {
        Games g1 = new Games();
        int gi = Greenfoot.getRandomNumber(7);
        int GameImg = Greenfoot.getRandomNumber(4);
        gameNum++;
        //int GameImg = Greenfoot.getRandomNumber(4);
        if(gi == 0)
        {
            addObject(g, 400, 400);
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
            addObject(g2, 200, 350);
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
            addObject(g2,150, 450);
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
            addObject(g2,550, 350);
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
            addObject(g2,550, 150);
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
            addObject(g2,605, 325);
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
