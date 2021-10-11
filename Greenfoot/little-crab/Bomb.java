import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Animal
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        killCrabs();
        if (atWorldEdge() == true) {
            
        }
    }
    
    /**
     * Kills crabs
     */
    public void killCrabs() {
        if (canSee(Crab.class) == true) {
            eat(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}
