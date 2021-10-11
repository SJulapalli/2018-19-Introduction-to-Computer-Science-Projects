import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootImage img;
    private int number;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 600, 1);
        populateWorld();
    }
    
    /**
     * Places the Hero in the center of the screen, Heart in top-left, Spade in top-right, Diamond in the bottom-left, and Club in bottom right.
     */
    public void populateWorld() {
        addObject(new Hero(), getWidth() / 2, getHeight() / 2);
        addObject(new Heart(), 50, 50);
        addObject(new Spade(), 750, 50);
        addObject(new Club(), 750, 550);
        addObject(new Diamond(), 50, 550);
    }
}
