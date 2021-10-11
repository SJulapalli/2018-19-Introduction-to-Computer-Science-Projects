import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man2 extends Actor

{
    private int fallingSpeed = Greenfoot.getRandomNumber(3) + 1;

    /**
     * Act - do whatever the Man2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        rain();
    }
    
    /**
     * Makes it rain "men"
     */
    public void rain() {
        setLocation(getX() + fallingSpeed, getY());
        turn(Greenfoot.getRandomNumber(720) - 360);
    }
}
