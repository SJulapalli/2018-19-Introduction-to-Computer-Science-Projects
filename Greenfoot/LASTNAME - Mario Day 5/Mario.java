import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Mario is the hero.
 * 
 * Suhas Julapalli
 * Period 4
 * 6/7/19
 * 
 */
public class Mario extends Actor
{
    private GreenfootImage mario1;
    private GreenfootImage mario2;
    private GreenfootImage mario_stand; // EC for getting Mario to stand still
    public int coinsGathered; // How many coins has Mario gathered?
    /**
     * Mario Constructor
     * Set initial image to mario_stand.
     * Initialize mario1 and mario2 to be mario's walking images
     */
    public Mario()
    {
        setImage("mario_stand.png");
        mario1 = new GreenfootImage("mario_walk_right1.png");
        mario2 = new GreenfootImage("mario_walk_right2.png"); 
        mario_stand = new GreenfootImage("mario_stand.png"); // EC graphic for Mario standing
        coinsGathered = 0;
    }

    /**
     * Make Mario Walk
     */
    public void act() 
    {
        marioMovement();
        lookForCoin();
    }
    
    /**
     * Make Mario move!
     */
    public void marioMovement()
    {
        if (Greenfoot.isKeyDown("left") )
        {
            setLocation( getX() - 4, getY() );
            switchImage();
        }
        if (Greenfoot.isKeyDown("right") )
        {
            setLocation( getX() + 4, getY() );
            switchImage();
        }
        if (Greenfoot.isKeyDown("up") )
        {
            setLocation( getX(), getY() - 4 );
            switchImage();
        }
        if (Greenfoot.isKeyDown("down") )
        {
            setLocation( getX(), getY() + 4);
            switchImage();
        }  
        
        // Fix for Diagonal Movement Issue
        if (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("up") )
        {
            setLocation( getX() - 3, getY() - 3);
            switchImage();
        }
        if (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("down") )
        {
            setLocation( getX() - 3, getY() + 3);
            switchImage();
        }        
        if (Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("up") )
        {
            setLocation( getX() + 3, getY() - 3);
            switchImage();
        }        
        if (Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("down") )
        {
            setLocation( getX() + 3, getY() + 3);
            switchImage();
        }
        
        // Get Mario to stand still
        if (!Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("up") &&!Greenfoot.isKeyDown("down"))
        {
            setImage(mario_stand);
        }
    }
    
    /**
     * Switch between Mario's walking images.
     */
    public void switchImage()
    {
        if (getImage() == mario1)
        {
            setImage(mario2);
        }
        else
        {
            setImage(mario1);
        }
    }
    
    /**
     * Look for and Grab those coins!
     */
    public void lookForCoin()
    {
        if ( isTouching(Coin.class) )
        {
            removeTouching(Coin.class);
            coinsGathered++;
            Greenfoot.playSound("coin-sound.mp3");
        }
    }
    
    /**
     * Returns the number of coins that Mario has currently gathered
     */
    public int totalCoins()
    {
        return coinsGathered;
    }
}