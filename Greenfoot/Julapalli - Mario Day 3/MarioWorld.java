import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world the game is played upon
 * 
 * Suhas Julapalli
 * 6/5/19
 * Period 4
 */
public class MarioWorld extends World
{
    private Enemy enemy1;
    private Enemy enemy2;
    private Enemy enemy3;
    private Enemy enemy4;
    private Enemy [] enemies = {enemy1, enemy2, enemy3, enemy4};
    private String [] images = {"boo.png", "koopa_green.png", "koopa_red.png", "bullet_bill.png"};
    
    /**
     * Constructor for objects of class MarioWorld.
     * 
     */
    public MarioWorld()
    {    
        super(800, 600, 1); 
        makeEnemies();
    }
    
    /**
     * Act method for MarioWorld
     */
    public void act() {
        enemyScreenEdge(
    }
    
    /**
     * Assigns the neccesary values for the enemies.
     */
    public void makeEnemies() {
        for(int i = 0; i < enemies.length; i++) {
            int k = Greenfoot.getRandomNumber(enemies.length);
            enemies[i] = new Enemy(images[k]);
            addObject(enemies[i], getHeight() - Greenfoot.getRandomNumber(getHeight()), getWidth() - Greenfoot.getRandomNumber(getWidth()));
        }
    }
    
    /**
     * 
     */
    public void enemyScreenEdge() {
       int i = 0;
       while( i < enemies.length) {
          if (enemies[i].xCoordinate() > 775) {
             removeObject(enemies[i]);
             addObject(enemies[i], getHeight() - Greenfoot.getRandomNumber(getHeight()), 5);
          }
          i++;
       }
    }
}