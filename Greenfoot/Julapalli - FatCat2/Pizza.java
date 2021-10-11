import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Suhas Julapalli
 * Date: 5/14/19
 * Period: 4
 */

/**
 * Pizza falls from the sky and wiggles and rotates as it does.
 */
public class Pizza extends Actor
{
    private GreenfootImage pizza1;
    private int speed;
    
    /**
     * Constructor for Pizza. Sets Pizza's image to pizza1 at runtime and sets pizza1 to pizza_cheese.png.
     */
    public Pizza() {
        //sets the value for speed
        speed = Greenfoot.getRandomNumber(3) + 1;
        //sets pizza1 as equal to pizza_cheesse.png
        pizza1 = new GreenfootImage("pizza_cheese.png");
        //sets Pizza's image as pizza1 at runtime
        setImage(pizza1);
    }
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
