import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

//Piano Project

/**
 * Name: Suhas Julapalli
 * Period: 4
 * Date: 5/31/19
 */
public class Piano extends World
{
    private Key key;
    private String [] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "enter"};
    private String [] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"};
    private String [] blackKeys = {"w", "e", "", "r", "t", "y", "", "u", "i", "", "o"};
    private String [] blackNotes = {"3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#"};
    
    /**
     * Piano Constructor.
     * Makes the keys for the Piano at runtime.
     */
    public Piano() //Piano Constructor
    {
        super(800, 340, 1);
        makeWhiteKeys();
        makeBlackKeys();
        promptPlayer();
    }
    
    /**
     * Makes twelve piano keys
     */
    public void makeWhiteKeys() {
        int i = 0;
        while(i < whiteNotes.length) {
            key = new Key(whiteKeys[i], whiteNotes[i] + ".wav", "white-key.png", "white-key-down.png");
            addObject(key , 53 + i * key.getImage().getWidth(), key.getImage().getHeight()/2);
            i++;
        }
    }
    
    /**
     * Makes 8 black keys
     */
    public void makeBlackKeys() {
        int i = 0;
        while(i < blackNotes.length) {
            key = new Key(blackKeys[i], blackNotes[i] + ".wav", "black-key.png", "black-key-down.png");
            if (blackKeys[i].equals("") != true) {
                addObject(key, 85 + (63 * i), key.getImage().getHeight()/2);
            }
            i++;
        }
    }
    
    /**
     * Prompts the user to "Click run to play the piano"
     */
    public void promptPlayer() {
        showText("Click run to play the piano", getWidth()/2, 310);
    }
    
    /**
     * Auto plays notes
     */
    public void playNotes() {
        for (int i = 0; i < whiteNotes.length; i++) {
            Greenfoot.playSound(whiteNotes[i] + ".wav");
            Greenfoot.delay(7);
        }
    }
}