import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Suhas Julapalli
 * Date: 5/16/19
 * Period: 4
 */

/**
 * This is a world where cats eat pizza that falls from the sky.
 */
public class CatWorld  extends World
{
    public int pizzaHasFallen;
    /**
     * CatWorld Constructor.
     */
    public CatWorld()
    {
        super(700, 500, 1);
        pizzaHasFallen = 0;
        addObject(new Cat(), getWidth()/2, getHeight() - 55); //adds a Cat at the bottom center of the screen
    }
    
    /**
     * Act method for the CatWorld class
     */
    public void act() {
        pizzaFalling();
    }
    
    /**
     * Creates Falling pizza at random locations 2% of the time
     */
    public void pizzaFalling() {
        if (Greenfoot.getRandomNumber(100) < 2) {
            addObject(new Pizza(), Greenfoot.getRandomNumber(701), 10);
            pizzaHasFallen = pizzaHasFallen + 1;
        }
        
        if (pizzaHasFallen == 2) {
            pizzaHasFallen = 1;
        }
    }
}
