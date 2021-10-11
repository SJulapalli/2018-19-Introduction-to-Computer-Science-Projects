import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab.
 */

public class SandMonster extends Animal
{
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge();
        move();
        randomTurn();
        locateAndConsumeTheEnemy();
    }
    
    /**
     *  Seek and Destroy All Animals
     */
    
    public void locateAndConsumeTheEnemy() {
        if (canSee(Worm.class) == true) {
            eat(Worm.class);
        }
        if (canSee(Crab.class) == true) {
            eat(Crab.class);
            Greenfoot.stop();
        }
        if (canSee(Lobster.class) == true) {
            eat(Lobster.class);
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
     *  Turn 10 degrees when sand monster is at the edge of the world
     */
    public void turnAtEdge(){
        if (atWorldEdge() == true) {
            turn(10); //turn 10 degrees
            move(); //move forward
        }
    }
}
