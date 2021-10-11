import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Suhas Julapalli
 * Date: 5/16/19
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
    private GreenfootImage cat_dance;
    private GreenfootImage cat_dance2;
    private GreenfootImage cat_sleep;
    private GreenfootImage cat_sleep2;
    private GreenfootImage cat_sleep3;
    private GreenfootImage cat_sleep4;
    //Instance variable to hold the number of Pizzas eaten
    private int pizzasEaten;
    
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
        cat_dance = new GreenfootImage("cat-dance.png");
        cat_dance2 = new GreenfootImage("cat-dance-2.png");
        cat_sleep = new GreenfootImage("cat-sleep-1.png");
        cat_sleep2 = new GreenfootImage("cat-sleep-2.png");
        cat_sleep3 = new GreenfootImage("cat-sleep-3.png");
        cat_sleep4 = new GreenfootImage("cat-sleep-4.png");
        pizzasEaten = 0;
        setImage(cat_sleep);
    }

    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        catMove();  //move the Cat
        eatPizza(); //eat the pizza
        endGame(); //ends the game once 10 Pizzas are eate
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
     * When the Cat finds the Pizza, it eats the pizza
     */
    public void eatPizza()
    {
        if(canSee(Pizza.class))
        {
            eat(Pizza.class);
            setImage(eat_pizza);    //The following lines switch back and forth with a slight delay inbetween.
            Greenfoot.delay(5);
            setImage(eat_pizza2);
            Greenfoot.delay(5);
            setImage(eat_pizza);
            Greenfoot.delay(5);
            setImage(eat_pizza2);
            Greenfoot.delay(5);
            setImage(eat_pizza);
            Greenfoot.delay(5);
            setImage(eat_pizza2);
            pizzasEaten = pizzasEaten + 1;
        }
    }
    
    /**
     * Ends game once pizzasEaten is equal to ten
     */
    public void endGame() {
        if (pizzasEaten  >= 10) {
            setImage(cat_dance);
            Greenfoot.delay(5);
            setImage(cat_dance2);
            Greenfoot.delay(5);
            setImage(cat_dance);
            Greenfoot.delay(5);
            setImage(cat_dance2);
            Greenfoot.delay(5);
            setImage(cat_dance);
            Greenfoot.delay(5);
            setImage(cat_dance2);
            Greenfoot.delay(5);
            setImage(cat_dance);
            Greenfoot.delay(5);
            setImage(cat_dance2);
            Greenfoot.delay(5);
            setImage(cat_dance);
            Greenfoot.delay(5);
            setImage(cat_dance2);
            Greenfoot.delay(5);
            setImage(cat_dance);
            Greenfoot.delay(5);
            setImage(cat_dance2);
            Greenfoot.stop();
        }
    }
}







