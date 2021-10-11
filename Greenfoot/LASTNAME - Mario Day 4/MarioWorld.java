import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MarioWorld here.
 * 
 * Suhas Julapalli
 * Period 4
 * 6/6/19
 * 
 */
public class MarioWorld extends World
{
    private Enemy enemy1, enemy2, enemy3, enemy4;
    private Mario hero;
    private Enemy [] enemies = {enemy1, enemy2, enemy3, enemy4};
    private String [] images = {"boo.png", "koopa_green.png", "koopa_red.png", "bullet_bill.png"};
    /**
     * Constructor for objects of class MarioWorld.
     * 
     */
    public MarioWorld()
    {    
        super(800, 600, 1); 
        hero = new Mario();
        addHero();
        addCoin();
        makeEnemies();
    }
    
    /**
     * Repeat this task.
     */
    public void act()
    {
        enemyScreenEdge();
    }
    
    /**
     * Make the enemies and assign them different graphics
     */
    public void makeEnemies()
    {
        int i = 0;    // Increment variable for the loop
        int k;    // Random number variable
        while (i < enemies.length)
        {
            k = Greenfoot.getRandomNumber(images.length);
            enemies[i] = new Enemy(images[k]);
            
            addObject(enemies[i], Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()) );
            i++;
        }
    }
    
    /**
     * Move enemies from the right side of the screen to the left side
     */
    public void enemyScreenEdge()
    {
        int i = 0;
        while (i < enemies.length)
        {
            if ( enemies[i].xCoordinate() > getWidth() - 25 )
            {
                removeObject( enemies[i] );
                int k = Greenfoot.getRandomNumber(images.length);
                enemies[i] = new Enemy(images[k]);
                addObject( enemies[i], 25, Greenfoot.getRandomNumber(getHeight()) ); 
            }
            i++;
        }
    }
    
    /**
     * Adds an object of class Mario to the midpoint of the bottom of the screen
     */
    public void addHero() {
        addObject(hero, getWidth()/2, getHeight() - 35);
    }
    
    /**
     * Adds a coin object at the top of the world with a random X-coordinate value
     */
    public void addCoin() {
        addObject(new Coin(), getWidth() - Greenfoot.getRandomNumber(getWidth()), 35);
    }
}