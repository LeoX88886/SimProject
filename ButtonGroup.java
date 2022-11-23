import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ButtonGroup is an actor that is bacicaly an array that holds differnt number of buttons (mainly 3) that is ued in the settings world
 * to alter the number of objects or scores within the actual play screen.
 * @param size   The number of buttons in the group
 * 
 * 
 * @author Tyson Darius Pellatt, Jordan Cohen
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
        //size is for how many buttons are in the group
    }

    public void addedToWorld (World w){
        for (int i = 0; i < buttons.length; i++){
            w.addObject(buttons[i], getX() + (i * 50), getY());
        }
        //to add the buttons to the world side by side.
    }
    
    public void addButton (Button b){
        ///adds a new button to the group
        if (nextIndex < buttons.length)
        {
            buttons [nextIndex] = b;
            nextIndex++;
        }
    }

    public void setSelection (int value){
        //change the vaue of the group and ther image
        if (value < buttons.length){
            currentSelection = value;
        }
        buttons[value].switchImage();
    }
    
    public int getCurrentValue (){
        return buttons[currentSelection].getValue();
        //to check the current chosen value
    }
    
    public void changeSelection (Button clicked){
        //if another button is clicked that was not chosen the rest, all 
        //become unchosen but the one that was clicked is now the chosen value.
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
        //to change the chosen button/value
    }
}
