import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurlapMonster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurlapMonster extends Animal
{
    /**
     * Act - do whatever the BurlapMonster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
       move();
       confusion();
       turnAtEdge();
       consumeAllCreatures();
    }
    
    /**
     * Makes the Burlap Monster move randomly due to confusion in the negative zone
     */
    public void confusion() {
        turn(Greenfoot.getRandomNumber(40) - 20);
    }
    
    /**
     * Make the Burlap Monster put the yummy in its tummy
     */
    public void consumeAllCreatures() {
        if (canSee(SandMonsterFoot.class) == true) {
            eat(SandMonsterFoot.class);
        }
    }
    
    /**
     * Makes the Burlap Monster turn once it reaches the edge of the world.
     */
    public void turnAtEdge() {
        if (isAtEdge() == true) {
            turn(90);
        }
    }
}
