import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Starfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starfish extends Animals
{
    /**
     * Act - do whatever the Starfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        untouch();
    }  

    public void untouch() {
        if (canSee(Dolphin.class) && (getWorld().getObjects(Dolphin.class).size() != 0)) {
            getWorld().removeObject(this);
            untouchable = 500;
        }
    }
}
