import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Cat is lazy and likes to eat pizza.
 */
public class Cat extends Animal
{
    //Declaration of Instance Variables to hold the images.
    private GreenfootImage cat_sit;
    private GreenfootImage walk_left; 
    private GreenfootImage walk_left2;
    private GreenfootImage walk_right; 
    private GreenfootImage walk_right2;
    private GreenfootImage eat_pizza; 
    private GreenfootImage eat_pizza2;
    
    /**
     * Cat Constructor.  Initializes variables and sets the image of the Cat.
     */
    public Cat()
    {
        //Initialize the value of the image variables.
        cat_sit = new GreenfootImage("cat-sit.png");
        walk_left = new GreenfootImage("cat-walk-left.png");
        walk_left2 = new GreenfootImage("cat-walk-left2.png");
        walk_right = new GreenfootImage("cat-walk-right.png");
        walk_right2 = new GreenfootImage("cat-walk-right2.png");
        eat_pizza = new GreenfootImage("cat-eat.png");
        eat_pizza2 = new GreenfootImage("cat-eat2.png");
        
    }
    
    
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}
