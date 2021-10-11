import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Player's character. It is capable of being controlled by the player using the arrow keys
 * 
 * Suhas Julapalli
 * Period 4
 * 6/3/19
 */
public class Mario extends Actor
{
    private GreenfootImage mario1;
    private GreenfootImage mario2;
    
    /**
     * Constructor for Mario
     * Set's Mario's image as "mario_stand.png" at runtime.
     */
    public Mario() {
        setImage("mario_stand.png");
        mario1 = new GreenfootImage("mario_walk_right1.png");
        mario2 = new GreenfootImage("mario_walk_right2.png");
    }
    
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        marioMovement();
    }
    
    /**
     * Allows the player to control mario's movement using the arrow keys
     */
    public void marioMovement() {
        if(Greenfoot.isKeyDown("UP") == true) {
            setLocation(getX(), getY() - 5);
            switchImage();
        }
        if(Greenfoot.isKeyDown("DOWN") == true) {
            setLocation(getX(), getY() + 5);
            switchImage();
        }
        if(Greenfoot.isKeyDown("LEFT") == true) {
            setLocation(getX() - 5, getY());
            switchImage();
        }
        if(Greenfoot.isKeyDown("RIGHT") == true) {
            setLocation(getX() + 5, getY());
            switchImage();
        }
        if(Greenfoot.isKeyDown("UP") && Greenfoot.isKeyDown("RIGHT") == true) {
            setLocation(getX() + 1, getY() - 1);
            switchImage();
        }
        if(Greenfoot.isKeyDown("UP") && Greenfoot.isKeyDown("LEFT") == true) {
            setLocation(getX() - 1, getY() - 1);
            switchImage();
        }
        if(Greenfoot.isKeyDown("DOWN") && Greenfoot.isKeyDown("RIGHT") == true) {
            setLocation(getX() + 1, getY() + 1);
            switchImage();
        }
         if(Greenfoot.isKeyDown("DOWN") && Greenfoot.isKeyDown("LEFT") == true) {
            setLocation(getX() - 1, getY() + 1);
            switchImage();
        }
    }
    
    /**
     * Switches Mario's current image between mario1 and mario2 according to which Mario is currently set to.
     */
    public void switchImage() {
        if(getImage() == mario1) {
            setImage(mario2);
        }
        else {
            setImage(mario1);
        }
    }
}
