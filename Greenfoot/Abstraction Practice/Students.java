import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Students extends Actor

{
    private String studentName;
    private int studentAge;
    private String studentHairColor;
    int f;
    private String [] images = {"man.png", "apple1.png", "apple2.png", "ant.png"};
    /**
     * Constructor for the Students Class
     * Collects the name, age, and hair color of students at runtime and assigns them to the appropriate variables.
     */
    
    public Students() {
        f = Greenfoot.getRandomNumber(3);
    }
    
    /**
     * Act - do whatever the Students wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for(int i = 0; i < 5; i++) {
            setImage(new GreenfootImage(images[Greenfoot.getRandomNumber(images.length)]));
        }
    }    
}
