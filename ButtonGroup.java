import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonGroup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonGroup extends Actor
{
    public Button[] buttons;
    private int currentSelection;
    private int nextIndex;
    public ButtonGroup (int size){
        currentSelection = 0;
        nextIndex = 0;
        buttons = new Button[size];
    }

    public void addedToWorld (World w){
        for (int i = 0; i < buttons.length; i++){
            w.addObject(buttons[i], getX() + (i * 50), getY());
        }
        
    }
    
    public void addButton (Button b){
        if (nextIndex < buttons.length)
        {
            buttons [nextIndex] = b;
            nextIndex++;
        }
        
    }

    public void setSelection (int value){
        if (value < buttons.length){
            currentSelection = value;
        }
        buttons[value].switchImage();
    }
    
    public int getCurrentValue (){
        return buttons[currentSelection].getValue();
    }
    
    public void changeSelection (Button clicked){
        for (int i = 0; i < buttons.length; i++){
            Button b = buttons[i];
            if (b == clicked){
                b.select();
                currentSelection = i;
            } else {
                b.unselect();
            }
        }
    }

    /**
     * Act - do whatever the ButtonGroup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        for (Button b : buttons){
            if (Greenfoot.mouseClicked(b)){
                changeSelection(b);
            }
        }
    }
}
