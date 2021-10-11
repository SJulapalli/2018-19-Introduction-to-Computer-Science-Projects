import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    private int fallingSpeed;
    private int turningSpeed;
    public Man() {
        fallingSpeed = Greenfoot.getRandomNumber(4) + 2;
        turningSpeed = Greenfoot.getRandomNumber(21) - 10;
        if (turningSpeed == 0) {
            turningSpeed = 1;
        }
    }
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        randomFalling();
        randomSpinning();
        //teleportAtEdge();
    }
    
    /**
     * Makes the Man fall at random speeds
     */
    public void randomFalling() {
        setLocation(getX(), getY() + fallingSpeed);
    }
    
    /**
     * Makes the Man fall at random speeds
     */
    public void randomSpinning() {
        setRotation(getRotation() + turningSpeed);
    }
    
    /**
     * Makes the Man teleport back to the top of the screen if he reaches within 30 pixels close to the bottom border of the screen
     */
    public void teleportAtEdge() {
        if (getY() > 530) {
            setlocation(getX(), 5);
        }
    }
}
