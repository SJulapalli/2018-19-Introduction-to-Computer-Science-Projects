import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown = false;
    public String key;     //Key to be pressed
    public String sound;   //sound to play
    public String upImage;
    public String downImage;
    /**
     * Constructor for Key
     */
    public Key(String keyName, String soundFile, String img1, String img2) {
        isDown = false;
        key = keyName;
        sound = soundFile;
        upImage = img1;
        downImage = img2;
        setImage(upImage);
    }

    public void act()
    {
        if (isDown == false && Greenfoot.isKeyDown(key) == true) {
            setImage(downImage);
            isDown = true;
            play();
        }
        if (isDown == true && Greenfoot.isKeyDown(key) == false){
            setImage(upImage);
            isDown = false;
        }
    }
    
    /**
     * Plays a sound set by the user
     */
    public void play() {
        Greenfoot.playSound(sound);
    }
}