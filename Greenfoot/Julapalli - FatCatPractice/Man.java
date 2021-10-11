import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        teleport();
        rainingMen();
    }
    
    /**
     * Lets the user control the mans movement
     */
    public void movement() {
        if (Greenfoot.isKeyDown("LEFT") == true ) {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("RIGHT") == true ) {
            setLocation(getX() + 5, getY());
        }
        if (Greenfoot.isKeyDown("UP") == true ) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("DOWN") == true ) {
            setLocation(getX(), getY() + 5);
        }
    }
    
    /**
     * Teleports the man to the left side of the screen if he touches the right side, and vice versa
     */
    public void teleport() {
        if (getX() > 590) {
            setLocation(10, getY());
        }
        if (getX() < 10) {
            setLocation(590, getY());
        }
    }
    
    public void rainingMen() {
        if (Greenfoot.isKeyDown("SPACE") == true) {
            getWorld().addObject(new Man2(), getX() + 20, getY() - 50);
            getWorld().addObject(new Man2(), getX() + 20, getY());
            getWorld().addObject(new Man2(), getX()+ 20, getY() + 50);
        }
    }
}
