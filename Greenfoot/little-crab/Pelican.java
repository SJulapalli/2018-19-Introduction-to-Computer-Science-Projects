import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelican here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelican extends Animal
{
    /**
     * Act - do whatever the Pelican wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        killLobsters();
    }
    
    /**
     * Kills crabs
     */
    public void killLobsters() {
        if (canSee(Lobster.class) == true) {
            eat(Lobster.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
}
