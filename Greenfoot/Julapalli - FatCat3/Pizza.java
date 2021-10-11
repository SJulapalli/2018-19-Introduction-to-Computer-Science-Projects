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
    private int rotation;
    public Pizza()
    {
        pizza1 = new GreenfootImage("pizza_cheese.png");
        setImage(pizza1);
        speed = Greenfoot.getRandomNumber(3) + 1;   //Random Number between 1 and 3
        rotation = Greenfoot.getRandomNumber(21) - 10;
    }
    
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        falling(); //makes the Pizza fall and turn at random speeds
        disappear(); //makes the PIzza disappear once within 25 units of the bottom world border
    }    
    
    /**
     * The Pizza is falling and rotating.
     */
    public void falling()
    {
        int wiggle;
        wiggle =  Greenfoot.getRandomNumber(7) - 3; //sets wiggle as equal to a random number between -3 and 3 (inclusive)
        setLocation(getX() + wiggle, getY() + speed);
        setRotation(getRotation() + rotation); //sets the rotation of the Pizza as a random number between -10 and 10 (inclusive)
    }
    
    /**
     * Makes the Pizza disappear once it gets within 25 units of the bottom of the world.
     */
    public void disappear() {
        if (getY() + 25 >= 500) { //if the Pizza's current Y-coordinate is within 25 units of 500, it will be removed from the world
            getWorld().removeObject(this);
        }
    }
}
