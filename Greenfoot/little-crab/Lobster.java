import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Animal
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        saveWorms();
        //killWorms();
        turnAtEdge();
        move();
        randomTurn();
    }
    
    /**
     * Eat crabs to save worms!
     */
    public void saveWorms() {
        if (canSee(Crab.class) == true) {
            eat(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    
     /**
     * Eat worms to save the world!
     */
    public void killWorms() {
        if (canSee(Worm.class) == true) {
            eat(Worm.class);
        }
    }
    
    /**
     * Turns lobster when at the edge of the world
     */
    public void turnAtEdge() {
        if (atWorldEdge() == true) {
            turn(10);
            move();
        }
    }
    
    /**
     * Turns a random number of degrees between -45 & 45 10% of then time.
     */
    public void randomTurn() {
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(91) - 45);
            move();
        }
    }
   
}
