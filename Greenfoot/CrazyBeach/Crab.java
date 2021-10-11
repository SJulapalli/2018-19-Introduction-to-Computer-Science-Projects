import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab.
 */

public class Crab extends Animal
{
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge();
        //move();
        //randomTurn();
        locateAndConsumeTheEnemy();
        checkKeyPress();
    }
    
    /**
     *  Seek and Destroy Worms
     */
    
    public void locateAndConsumeTheEnemy() {
        if (canSee(Worm.class) == true) {
            eat(Worm.class);
        }
    }
    
    /**
     * Turn a random number of degrees between 45 & -45 degrees 10% of the time.
     */
    public void randomTurn() {
        if (Greenfoot.getRandomNumber(100) < 10) { //10% chance
            turn(Greenfoot.getRandomNumber(91) - 45); //Random turning degree
            move(); //move forward
        }
    }
    
    /**
     *  Turn 10 degrees when crab is at the edge of the world
     */
    public void turnAtEdge(){
        if (atWorldEdge() == true) {
            turn(10); //turn 10 degrees
            move(); //move forward
        }
    }
    
    /**
     * Checks for user input to turn the crab either to the left or right when the corresponding arrow key is pressed
     */
    public void checkKeyPress(){
        if (Greenfoot.isKeyDown("left") == true) { //left turn
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right") == true) { //right turn
            turn(4);
        }
    }
}