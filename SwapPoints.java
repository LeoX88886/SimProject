import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * SwapPoints essentially swaps the score of all the teams when interacted
 * by a team subclass
 * 
 * @author Justin Sin
 * @version 1
 */
public class SwapPoints extends Effects
{
    private GreenfootImage effectImage = new GreenfootImage("images/Effects/pointswap.png");
    private GreenfootSound sp = new GreenfootSound("sounds/SwapPoints.mp3");
    private static int numTeams;
    
    public void act()
    {
        // Add your action code here.
        effectImage.scale(50, 50);
        setImage(effectImage);
        
        checkHitTeams();
        
        if(delete){
            removeThis();
        }
    }
    
    
    public boolean checkHitTeams(){
        Teams t = (Teams)getOneObjectAtOffset(0, 0, Teams.class);
        if(t != null){
            //swaps the points on the score board when hitting teams
            if(numTeams == 2){
                int s1 = Games.getScoreOneExtra();
                int s2 = Games.getScoreTwoExtra();
            
                Games.setScoreOne(s2);
                Games.setScoreTwo(s1);
            }else if(numTeams == 3){
                int s1 = Games.getScoreOneExtra();
                int s2 = Games.getScoreTwoExtra();
                int s3 = Games.getScoreThreeExtra();
            
                Games.setScoreOne(s3);
                Games.setScoreTwo(s1);
                Games.setScoreThree(s2);
            }else if(numTeams == 4){
                int s1 = Games.getScoreOneExtra();
                int s2 = Games.getScoreTwoExtra();
                int s3 = Games.getScoreThreeExtra();
                int s4 = Games.getScoreFourExtra();                
                Games.setScoreOne(s4);
                Games.setScoreTwo(s1);
                Games.setScoreThree(s2);
                Games.setScoreFour(s3);
            }
            
            sp.setVolume(30);
            sp.play();
            MyWorld.subK();
            delete = true;
            return true;
        }
        return false;
    }
    
    public static void setNumTeams(int num){
        numTeams = num;
    }
    
    public void removeThis(){
        getWorld().removeObject(this);
    }
}