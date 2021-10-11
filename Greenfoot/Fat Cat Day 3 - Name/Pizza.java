import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Suhas Julapalli
 * Date: 5/15/19
 * Period: 4
 */

/**
 * Pizza falls from the sky and wiggles and rotates as it does.
 */
public class Pizza extends Actor
{
    private GreenfootImage pizza1;  //Variable to store the pizza image
    private int speed;              //Variable to store the speed the pizza will fall.
    
    public Pizza()
    {
        pizza1 = new GreenfootImage("pizza_cheese.png");
        setImage(pizza1);
        speed = Greenfoot.getRandomNumber(3) + 1;   //Random Number between 1 and 3
    }
    
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        falling();
        disappear();
    }    
    
    /**
     * The Pizza is falling and rotating.
     */
    public void falling()
    {
        int wiggle;
        wiggle =  Greenfoot.getRandomNumber(7) - 3; //
        setLocation(getX() + wiggle, getY() + speed);
        setRotation(getRotation() + Greenfoot.getRandomNumber(21) - 10);
    }
    
    /**
     * Makes the Pizza disappear once it gets within 25 units of the bottom of the world.
     */
    public void disappear() {
        if (getY() + 35 >= 500) {
            getWorld().removeObject(this);
        }
    }
}
