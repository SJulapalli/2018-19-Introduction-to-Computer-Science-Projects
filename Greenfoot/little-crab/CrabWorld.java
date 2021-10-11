import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    private Crab crabby;
    private GreenfootImage snapImage;
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        crabby = new Crab();
        populateWorld();
        snapImage = new GreenfootImage("crab.png");
    }
    
    public void act() {
        realityWormSnap();
        //spaceWormSnap();
        powerWormSnap();
        if (crabby.counter() >= 8) {
            addObject(new Lobster(), 100, 230);
            addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
            addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
            addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
            addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
            addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
            addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
            addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
            addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
            crabby.reset();
        }
    }
    
    /**
     * Populates the world with crabs, lobsters, and worms.
     */
    public void populateWorld() {
        addObject(crabby,230,50);
        addObject(new Lobster(), 500, 500);
        addObject(new Lobster(), 400, 400);
        addObject(new Lobster(), 250, 250);
        addObject(new Seal(), 50, 230);
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
    }
    
    /**
     * Use the infinity worms to crabify the world
     */
    public void realityWormSnap() {
        if (Greenfoot.isKeyDown("R") == true) {
            setBackground(snapImage);
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("au.wav");
        }
    }
    
    /**
     * Teleport to a new location using the Space Worm
     */
    public void spaceWormSnap() {
        if (Greenfoot.isKeyDown("S") == true) {
            Greenfoot.playSound("EnergyGun.wav");
            crabby.setLocation(crabby.getX() + Greenfoot.getRandomNumber(600) - 300, crabby.getY() + Greenfoot.getRandomNumber(600) - 300);
        }
    }
    
    /**
     * Consume worms through the power of the Power Worm
     */
    public void powerWormSnap() {
        if (Greenfoot.isKeyDown("P") == true) {
            crabby.wormsConsumed = crabby.wormsConsumed + 8;
        }
    }
}
