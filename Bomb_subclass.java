import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb_subclass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)    
 */
public class Bomb_subclass extends Troop_Base
{
    private long lastProjectileTime = 0;
    private static final long PROJECTILE_DELAY = 500000; 
    boolean game_started = false;
    public void act()
    {
        if (Greenfoot.isKeyDown("D")){
            Movement();
        }
        if (Greenfoot.isKeyDown("space")|| game_started){
            game_started = true;
            lastProjectileTime=Attack(lastProjectileTime, PROJECTILE_DELAY,20);
            
    }
}
}
