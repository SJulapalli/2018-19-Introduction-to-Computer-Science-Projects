import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pizza falls from the sky and wiggles and rotates as it does.
 */
public class Pizza extends Actor
{
    private GreenfootImage pizza1;  //Variable to store the pizza image
    private int speed;              //Variable to store the speed the pizza will fall.
    private int rot;
    
    public Pizza()
    {
        pizza1 = new GreenfootImage("pizza_cheese.png");
        setImage(pizza1);
        speed = Greenfoot.getRandomNumber(3) + 1;   //Random Number between 1 and 3
        rot = Greenfoot.getRandomNumber(11) - 5;
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
        wiggle = Greenfoot.getRandomNumber(7) - 3;
        setLocation(getX() + wiggle, getY() + speed);
        setRotation(getRotation() + rot);               //Extra credit shown.  Full points awarded for using a number instead of rot.
    }
    
    /**
     * Remove the pizza when it reaches the bottom of the world.
     */
    public void disappear()
    {
        if(getY() > getWorld().getHeight() - 25)        //Extra credit shown.  Full points awarded for using the number 475.
        {
            getWorld().removeObject(this);
        }
    }
}
