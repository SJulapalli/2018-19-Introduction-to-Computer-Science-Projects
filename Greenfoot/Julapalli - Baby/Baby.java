import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Animal
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        seekFood();
        consume();
    }
    
    /**
     * Moves the baby up, down, left, or right according to the user's inputs
     */
    public void seekFood() {
        if (Greenfoot.isKeyDown("UP") == true) {
            setLocation( getX(), getY() - 5);
        }
        
        if (Greenfoot.isKeyDown("DOWN") == true) {
            setLocation( getX(), getY() + 5);
        }
        
        if (Greenfoot.isKeyDown("LEFT") == true) {
            setLocation( getX() - 5, getY());
        }
        
        if (Greenfoot.isKeyDown("RIGHT") == true) {
            setLocation( getX() + 5, getY());
        }
    }
    
    /**
     * Lets baby eat food and plays a slurp sound afterwards
     */
    public void consume() {
        if (canSee(Pumpkin.class) == true) {
            eat(Pumpkin.class);
            Greenfoot.playSound("slurp.wav");
        }
        
        if (canSee(Flan.class) == true) {
            eat(Flan.class);
            Greenfoot.playSound("slurp.wav");
        }
        
        if (canSee(Lemur.class) == true) {
            eat(Lemur.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
}
