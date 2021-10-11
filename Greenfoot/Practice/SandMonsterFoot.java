import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SandMonsterFoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SandMonsterFoot extends Animal
{
    private int gunReloadTime;                  // The minimum delay between firing the gun.
    private int reloadDelayCount;               // How long ago we fired the gun the last time.
    private int shotsFired;                     // Number of shots fired.
  
    /**
     * Act - do whatever the SandMonsterFoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        footWalk();
        extremeSpeed();
        if (getX() > 590) {
            setLocation( 10, getY() );
        }
        if (getX() < 10 ) {
            setLocation( 590, getY() );
        }
    }
    
    /**
     * Movement method.
     * Up key moves object up, down moves it down, and left and right move it left and right respectively
     */
    public void footWalk() {        
        if (Greenfoot.isKeyDown("right") == true) {
            setLocation(getX() + 5, getY());
        }        
        if (Greenfoot.isKeyDown("left") == true) {
            setLocation(getX() - 5, getY());
        }        
        if (Greenfoot.isKeyDown("up") == true) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down") == true) {
            setLocation(getX(), getY() + 5);
        }
    }
    
    /**
     * Make the SandMonster's foot move at XTR3M3 SP33D5!!!1!!1
     */
    public void extremeSpeed() {
        if (Greenfoot.isKeyDown("space") == true) {
            setLocation(Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(400));
        }
    }
}
