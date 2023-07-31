import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank_tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank_tower extends Troop_Base
{
        private long lastProjectileTime = 0;
        private static final long PROJECTILE_DELAY = 500000; 
        boolean game_started = false;
    public void act()
    {
            if (Greenfoot.isKeyDown("S")){
                Movement();
            }
    
            if (Greenfoot.isKeyDown("space")|| game_started){
                game_started = true;
                lastProjectileTime=Attack(lastProjectileTime, PROJECTILE_DELAY,20);
            
    }
}
}
