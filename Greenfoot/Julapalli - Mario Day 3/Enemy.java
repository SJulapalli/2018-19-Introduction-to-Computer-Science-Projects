import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemies are bad news for Mario.
 * 
 * Suhas Julapalli
 * Period 4
 * 6/5/19
 * 
 */
public class Enemy extends Actor
{
    private String image1;
    private int speed;
    
    
    /**
     * Enemy Constructor
     * Set the initial Image using a parameter.
     * Set the speed variable to be 1-5 inclusive
     */
    public Enemy(String img)
    {
        image1 = img;
        setImage(image1);
        
        speed = Greenfoot.getRandomNumber(5) + 1; // 1 to 5 inclusive
    }
    /**
     * Make the Enemies do things
     */
    public void act() 
    {
        moveEnemies();
    }
    
    /**
     * Move the enemies across the screen horizontally from left to right
     * using speed as the increase in the x coordinate values.
     */
    public void moveEnemies()
    {
        setLocation( getX() + speed, getY() );
        
        if (isTouching(Mario.class) )
        {
            removeTouching(Mario.class);
            Greenfoot.playSound("endgame.wav");
            Greenfoot.stop();
        }
    }
    
    /**
     * Returns the X-coordinate of the Enemy
     */
    public int xCoordinate() {
        int x = getX();
        return x;
    }
}
