import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DPS_towoer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DPS_towoer extends Troop_Base
{
    /**
     * Act - do whatever the DPS_towoer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private long lastProjectileTime = 0;
    private static final long PROJECTILE_DELAY = 500000; 
    boolean game_started = false;
    public void act()
    {

        if (Greenfoot.isKeyDown("A")){
            Movement();
        }
        if (Greenfoot.isKeyDown("space")|| game_started){
            game_started = true;
            lastProjectileTime=Attack(lastProjectileTime, PROJECTILE_DELAY,20);
            
}
}
}
