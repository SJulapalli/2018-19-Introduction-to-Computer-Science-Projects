import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Suhas Julapalli
 * Date: 5/14/19
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
    //Declaration of Instance Variable to hold the number of runs of a loop
    private int runs;
    
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
        runs = 0;
        setImage(cat_sit);
    }
    
    
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        catMove();
        eatPizza();
    }    
    
    /**
     * Move the Cat with the arrow keys.
     */
    public void catMove()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
            switchImageRight();
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
            switchImageLeft();
        }
        
        if(Greenfoot.isKeyDown("right") == false && Greenfoot.isKeyDown("left") == false)
        {
            setImage(cat_sit);
        }
    }
    
    /**
     * Animate the Cat to the Right
     */
    public void switchImageRight()
    {
        if(getImage() == walk_right)
        {
            setImage(walk_right2);
        }
        else
        {
            setImage(walk_right);
        }
    }
    
    /**
     * Animate the Cat to the Left
     */
    public void switchImageLeft()
    {
        if(getImage() == walk_left)
        {
            setImage(walk_left2);
        }
        else
        {
            setImage(walk_left);
        }
    }
    
    /**
     * When the cat finds a slice of pizza, its image changes between eat_pizza and eat_pizza2 for a second and then switches back to cat_sit.
     */
    public void eatPizza() {
        if (canSee(Pizza.class) == true) {
            eat(Pizza.class);
            if (getImage() == eat_pizza) {
                    setImage(eat_pizza2);
                    Greenfoot.delay(10);
                    runs++;
            }
            else {
                    setImage(eat_pizza);
                    Greenfoot.delay(10);
            }
            if (getImage() == eat_pizza) {
                    setImage(eat_pizza2);
                    Greenfoot.delay(10);
                    runs++;
            }
            else {
                    setImage(eat_pizza);
                    Greenfoot.delay(10);
            }
            if (getImage() == eat_pizza) {
                    setImage(eat_pizza2);
                    Greenfoot.delay(10);
                    runs++;
            }
            else {
                    setImage(eat_pizza);
                    Greenfoot.delay(10);
            }
            if (getImage() == eat_pizza) {
                    setImage(eat_pizza2);
                    Greenfoot.delay(10);
                    runs++;
            }
            else {
                    setImage(eat_pizza);
                    Greenfoot.delay(10);
            }
            if (getImage() == eat_pizza) {
                    setImage(eat_pizza2);
                    Greenfoot.delay(10);
                    runs++;
            }
            else {
                    setImage(eat_pizza);
                    Greenfoot.delay(10);
            }
            if (getImage() == eat_pizza) {
                    setImage(eat_pizza2);
                    Greenfoot.delay(10);
                    runs++;
            }
            else {
                    setImage(eat_pizza);
                    Greenfoot.delay(10);
            }
            if (getImage() == eat_pizza) {
                    setImage(eat_pizza2);
                    Greenfoot.delay(10);
                    runs++;
            }
            else {
                    setImage(eat_pizza);
                    Greenfoot.delay(10);
            }
            if (getImage() == eat_pizza) {
                    setImage(eat_pizza2);
                    Greenfoot.delay(10);
                    runs++;
            }
            else {
                    setImage(eat_pizza);
                    Greenfoot.delay(10);
            }
            setImage(cat_sit);
        }
    }
}
