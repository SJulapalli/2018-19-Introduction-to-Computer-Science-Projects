import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Animal
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        randomlySeekBaby();
        eliminateBaby();
        turnAwayFromTheInfiniteGreyVoid();
    }
    
    /**
     * Makes the teddy bear constantly move forward and randomly turn between -45 and 45 degrees
     */
    public void randomlySeekBaby() {
        move();
        if (Greenfoot.getRandomNumber(100) < 20) {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }
    }
    
    /**
     * Ends the game once the teddy bear contacts the baby and plays the "au.wav" sound.
     */
    public void eliminateBaby() {
        if (canSee(Baby.class) == true) {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    
    /**
     * Makes the teddy bear turn 10 degrees if it reaches the edge of the world.
     */
    public void turnAwayFromTheInfiniteGreyVoid() {
        if (atWorldEdge() == true) {
            turn(10);
        }
    }
}
