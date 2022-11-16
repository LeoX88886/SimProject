import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SettingsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SettingsWorld extends World
{

    /**
     * Constructor for objects of class SettingsWorld.
     * 
     */
    BackButton b = new BackButton();
    /**
    T2Ch t2 = new T2Ch();
    T3Ch t3 = new T3Ch();
    T4Ch t4 = new T4Ch();
    */
    protected static int Ic2 = 1;
    protected static int Ic3 = 0;
    protected static int Ic4 = 0;
    public SettingsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(b,60,375);
        Game1 g = new Game1();
        addObject(g, 360, 270);
        /**
        addObject(t2,50,65);
        addObject(t3,100,65);
        addObject(t4,150,65);
        */
    }/**
    public static int IC(){
        if(Ic2 == 1){
            //t3.IC();
            //t4.IC();
            Ic3 = 0;
            Ic4 = 0;
        }else if(Ic3 == 1){
            //t2.IC();
            //t4.IC();
            Ic2 = 0;
            Ic4 = 0;
        }else if(Ic4 == 1){
            //t2.IC();
            //t3.IC();
            Ic2 = 0;
            Ic3 = 0;
        }
    }
    public int I2C(){
        Ic2 = 1;
    }
    public int I3C(){
        Ic3 = 1;
    }
    public int I4C(){
        Ic4 = 1;
    }*/
}
