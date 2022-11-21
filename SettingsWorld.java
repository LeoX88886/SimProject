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
    ButtonGroup numTeamsButton;
    ButtonGroup numGamesButton;
    public SettingsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(b,60,375);

        numTeamsButton = new ButtonGroup(3);
        // add three buttons
        numTeamsButton.addButton(new Button(2, new GreenfootImage("SettingButtons/2Teams.png"), new GreenfootImage("SettingButtons/Choose2.png")));
        numTeamsButton.addButton(new Button(3, new GreenfootImage("SettingButtons/3Teams.png"), new GreenfootImage("SettingButtons/Choose3.png")));
        numTeamsButton.addButton(new Button(4, new GreenfootImage("SettingButtons/4Teams.png"), new GreenfootImage("SettingButtons/Choose4.png")));
        
        // choose one to be selected
        numTeamsButton.setSelection(0);
        addObject(numTeamsButton, 25, 70);
        TeamsLabel L1 = new TeamsLabel(new GreenfootImage("SettingButtons/teamHeader.png"));
        addObject(L1,100,20);
        
        numGamesButton = new ButtonGroup(3);
        numGamesButton.addButton(new Button(3, new GreenfootImage("SettingButtons/3Teams.png"), new GreenfootImage("SettingButtons/Choose3.png")));
        numGamesButton.addButton(new Button(4, new GreenfootImage("SettingButtons/4Teams.png"), new GreenfootImage("SettingButtons/Choose4.png")));
        numGamesButton.addButton(new Button(5, new GreenfootImage("SettingButtons/5Teams.png"), new GreenfootImage("SettingButtons/Choose5.png")));
        numGamesButton.setSelection(0);
        addObject(numGamesButton,25,200);
    }
    
    public void act () {
        if (Greenfoot.mouseClicked(b)) 
        {
            Greenfoot.setWorld(new LobbyWorld(numTeamsButton.getCurrentValue(),(numGamesButton.getCurrentValue())));
        }
    }
}
