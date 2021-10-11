import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemies are bad news for Mario.
 * 
 * Suhas Julapalli
 * 6/4/19
 * Period 4
 */
public class Enemy extends Actor
{
    private String image1;
    private int speed;
    
    /**
     * Enemy Constructor
     * Set the initial Image to boo.png
     * Sets variable speed as equal to a random number between 1 and 5, inclusive.
     */
    public Enemy(String img1)
    {
        image1 = img1;
        setImage(image1 + ".png");
        speed = Greenfoot.getRandomNumber(5) + 1;
    }
    /**
     * Make the Enemies do things
     */
    public void act() 
    {
        moveEnemies();
    }
    
    /**
     * Moves the enemies horizontally at a random speed set in the "speed" variable.
     * Ends the game if Enemy hits mario and plays "endgame.wav"
     */
    public void moveEnemies() {
        setLocation(getX() + speed, getY());
        if(isTouching(Mario.class) == true) {
           removeTouching(Mario.class);
           Greenfoot.playSound("endgame.wav");
           Greenfoot.stop();
        }
    }
}
