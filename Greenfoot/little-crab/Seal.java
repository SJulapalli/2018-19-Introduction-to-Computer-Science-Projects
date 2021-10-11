import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Animal
{
    /**
     * Act - do whatever the Seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        throwBombs();
        throwPelicans();
        movement();
    }
    
    /**
     * Throw bombs that kill crabs!
     */
    public void throwBombs() {
        if (Greenfoot.isKeyDown("7") == true) {
            Greenfoot.playSound("EnergyGun.wav");
            getWorld().addObject(new Bomb(), getX(), getY());
        }
    }
    
    /**
     * Throw pelicans that kill lobsters!
     */
    public void throwPelicans() {
        if (Greenfoot.isKeyDown("9") == true) {
            Greenfoot.playSound("EnergyGun.wav");
            getWorld().addObject(new Pelican(), getX(), getY());
        }
    }
    
    /**
     * Allows player to control the seals movement on the up & down axis
     */
    public void movement() {
        if (Greenfoot.isKeyDown("8")  == true) {
            setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("5")  == true) {
            setLocation(getX(), getY() + 3);
        }
    }
}
