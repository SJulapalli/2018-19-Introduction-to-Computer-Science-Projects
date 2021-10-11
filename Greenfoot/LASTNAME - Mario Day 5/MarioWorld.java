import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MarioWorld here.
 * 
 * Suhas Julapalli
 * Period 4
 * 6/7/19
 * 
 */
public class MarioWorld extends World
{
    private Enemy enemy1, enemy2, enemy3, enemy4;
    private Enemy [] enemies = {enemy1, enemy2, enemy3, enemy4};
    private String [] images = {"boo.png", "koopa_green.png", "koopa_red.png", "bullet_bill.png"};
    private Mario hero;
    private boolean gotCoin;
    private GreenfootSound theme;
    
    /**
     * Constructor for objects of class MarioWorld.
     * 
     */
    public MarioWorld()
    {    
        super(800, 600, 1); 
        
        makeEnemies();
        
        hero = new Mario();
        addObject( hero, getWidth()/2, getHeight() - 50 );
        
        addObject( new Coin(), Greenfoot.getRandomNumber( getWidth() ), 35);
        
        gotCoin = false;
        
        theme = new GreenfootSound("theme.mp3");
        backgroundMusic();
    }
    
    /**
     * Repeat this task.
     */
    public void act()
    {
        enemyScreenEdge();
        endGame();
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
     * Ends the game when mario collects two coins
     */
    public void endGame() {
        if (hero.coinsGathered == 1 && gotCoin == false) {
            addObject(new Coin(), getWidth() - Greenfoot.getRandomNumber(getWidth()), getHeight() - 35);
            gotCoin = true;
        }
        if (hero.coinsGathered == 2 && gotCoin == true) {
            theme.pause();
            Greenfoot.playSound("victory.wav");
            Greenfoot.stop();
        }
    }
    
    /**
     * Plays the mario theme song throughout gameplay
     */
    public void backgroundMusic() {
        theme.playLoop();
    }
}