import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Suhas Julapalli
 * Date: 5/13/19
 * Period: 4
 */

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
     * Cat Constructor. Initializes variables and sets the image of the Cat at runtime.
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
        //sets the cat's image to cat_sit at run time.
        setImage(cat_sit);
    }
    
    
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        catMove(); //allows the user to move the cat to the left and right.
    }
    
    /**
     * Allows the user to move the cat to the left and to the right
     */
    public void catMove() { 
        //checks if the user is inputing "left", "right", or nothing.
        if (Greenfoot.isKeyDown("LEFT") == true) {
            //if "left" is inputed, the cat moves to the left and its image is set to walk_left.
            switchImageLeft();
            setLocation(getX() - 5, getY());
        }
        else if (Greenfoot.isKeyDown("RIGHT") == true) { 
            //if "right" is inputed, the cat moves to the right and its image is set to walk_right.
            switchImageRight();
            setLocation(getX() + 5, getY());
        }
        else { 
            //if neitheris inputed, the cat doesn't move and its image is set to cat_sit.
            setImage(cat_sit);
        }
    }
    
    /**
     * Sets the image to that of the cat walking to the left.
     */
    public void switchImageLeft() {
        //sets the cat's current image to walk_left
        setImage(walk_left);
    }
        
    /**
     * Sets the image to that of the cat walking to the right.
     */
    public void switchImageRight() {
        //sets the cat's current image to walk_right
        setImage(walk_right);
    }
}
