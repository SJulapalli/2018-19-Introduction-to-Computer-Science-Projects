import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
/**
 * This class defines a crab.
 */

public class Crab extends Animal
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    public int wormsConsumed = 0;
    
    /**
     * Crab constructor
     */
    public Crab() {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        wormsConsumed = 0;
        setImage(image1);
    }
    
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //move();
        locateAndConsume();
        checkKeyPress();
        //switchImage();
        //randomTurn();
        //turnAtEdge();
        //endGame();
    }

    /**
     *  Locate and consume your most vile foes, the WORMS.
     */
    
    public void locateAndConsume() {
        if (canSee(Worm.class) == true) {
            eat(Worm.class);
            wormsConsumed = wormsConsumed + 1;
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    /**
     * Turn a random number of degrees between 45 & -45 degrees 10% of the time.
     */
    public void randomTurn() {
        if (Greenfoot.getRandomNumber(100) < 10) { //10% chance
            turn(Greenfoot.getRandomNumber(91) - 45); //Random turning degree
            move(); //move forward
        }
    }
    
    /**
     *  Turn 10 degrees when crab is at the edge of the world
     */
    public void turnAtEdge(){
        if (atWorldEdge() == true) {
            turn(10); //turn 10 degrees
            move(); //move forward
        }
    }
    
    /**
     * Checks for user input to turn the crab either to the left or right when the corresponding arrow key is pressed
     */
    public void checkKeyPress(){
        if (Greenfoot.isKeyDown("left") == true) {
            switchImage();
            //turn(-4);
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("right") == true) {
            switchImage();
            //turn(4);
            setLocation(getX() + 5, getY());
        }
        if (Greenfoot.isKeyDown("up") == true ) {
            switchImage();
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down") == true) {
            switchImage();
            setLocation(getX(), getY() + 5);
        }
        if (Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left") == true) {
            switchImage();
            setLocation(getX() - 1, getY() + 1);
        }
        if (Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right") == true) {
            switchImage();
            setLocation(getX() + 1, getY() + 1);
        }
        if (Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left") == true) {
            switchImage();
            setLocation(getX() - 1, getY() - 1);
        }
        if (Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right") == true) {
            switchImage();
            setLocation(getX() + 1, getY() - 1);
        }
    }
    
    /**
     * Switches the image of the crab between crab.png and crab2.png
     */
    public void switchImage() {
        if (getImage() == image1) {
            setImage(image2);
        }
        else {
            setImage(image1);
        }
    }
    
    /**
     * Ends game if 8 worms are eaten
     */
    public void endGame() {
        if (wormsConsumed >= 8) {
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
    }
    
    /**
     * Returns the current value of wormsConsumed.
     */
    public int counter() {
        return wormsConsumed;
    }
    
    /**
     * Resets wormsConsumed to a value of 0
     */
    public void reset() {
        wormsConsumed = 0;
    }
}