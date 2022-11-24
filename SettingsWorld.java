import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world to change the settings of MyWorld
 * Can change # of Games spawned
 *            # of Teams spawned
 *            Score required for a Team to win
 * 
 * 
 * @author Tyson Pellatt
 * @version 1
 */
public class SettingsWorld extends World
{

    /**
     * Constructor for objects of class SettingsWorld.
     */
    protected static GreenfootImage background = new GreenfootImage ("images/BP Vector.jpg");
    BackButton b = new BackButton();
    ButtonGroup numTeamsButton;
    ButtonGroup numGamesButton;
    ButtonGroup numScorButton;
    //sound for button press
    private GreenfootSound button = new GreenfootSound("sounds/button.wav");
    
    
    public SettingsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        background = new GreenfootImage ("images/BP Vector.jpg");
        setBackground (this.background);
        addObject(b,60,375);

        numTeamsButton = new ButtonGroup(3);
        // add three buttons
        numTeamsButton.addButton(new Button(2, new GreenfootImage("SettingButtons/2Teams.png"), new GreenfootImage("SettingButtons/Choose2.png")));
        numTeamsButton.addButton(new Button(3, new GreenfootImage("SettingButtons/3Teams.png"), new GreenfootImage("SettingButtons/Choose3.png")));
        numTeamsButton.addButton(new Button(4, new GreenfootImage("SettingButtons/4Teams.png"), new GreenfootImage("SettingButtons/Choose4.png")));
        
        // choose one to be selected
        numTeamsButton.setSelection(0);
        addObject(numTeamsButton, 125, 210);
        TeamsLabel L1 = new TeamsLabel(new GreenfootImage("SettingButtons/teamHeader.png"));
        addObject(L1,175,160);
        
        //Arcad icon number sction
        numGamesButton = new ButtonGroup(3);
        numGamesButton.addButton(new Button(3, new GreenfootImage("SettingButtons/3Teams.png"), new GreenfootImage("SettingButtons/Choose3.png")));
        numGamesButton.addButton(new Button(4, new GreenfootImage("SettingButtons/4Teams.png"), new GreenfootImage("SettingButtons/Choose4.png")));
        numGamesButton.addButton(new Button(5, new GreenfootImage("SettingButtons/5Teams.png"), new GreenfootImage("SettingButtons/Choose5.png")));
        numGamesButton.setSelection(0);
        addObject(numGamesButton,375,210);
        TeamsLabel L2 = new TeamsLabel(new GreenfootImage("SettingButtons/gameHeader.png"));
        addObject(L2,425,160);
        
        //scor sction
        numScorButton = new ButtonGroup(3);
        numScorButton.addButton(new Button(4, new GreenfootImage("SettingButtons/4Teams.png"), new GreenfootImage("SettingButtons/Choose4.png")));
        numScorButton.addButton(new Button(5, new GreenfootImage("SettingButtons/5Teams.png"), new GreenfootImage("SettingButtons/Choose5.png")));
        numScorButton.addButton(new Button(8, new GreenfootImage("SettingButtons/8Teams.png"), new GreenfootImage("SettingButtons/Choose8.png")));
        numScorButton.setSelection(0);
        addObject(numScorButton,250,350);
        TeamsLabel L3 = new TeamsLabel(new GreenfootImage("SettingButtons/ScorHeader.png"));
        addObject(L3,300,300);
    }
    
    public void act () {
        LobbyWorld.stopMusic();
        if (Greenfoot.mouseClicked(b)) 
        {
            button.setVolume(70);
            button.play();
            
            Greenfoot.setWorld(new LobbyWorld(numTeamsButton.getCurrentValue(),numGamesButton.getCurrentValue(), numScorButton.getCurrentValue()));
            SwapPoints.setNumTeams(numTeamsButton.getCurrentValue());
        }
    }
}