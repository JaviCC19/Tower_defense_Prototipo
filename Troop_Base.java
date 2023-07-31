import java.util.Set;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Troop_Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Troop_Base extends Actor
{
    int counter = 0;
    
    // Aqui se hace el movimiento 
    public void Movement(){
        int speed = 10; 
        int x = getX();
        int y = getY();


        if (Greenfoot.isKeyDown("up")){
            y -= speed;
        }
        if (Greenfoot.isKeyDown("down")){
            y += speed;
        }
        if (Greenfoot.isKeyDown("left")){
            x -= speed;
        }
        if (Greenfoot.isKeyDown("right")){
            x += speed;
        }
        setLocation(x, y);
    }

    //  Attaque aqui
    public long Attack(long lastProjectileTime, long PROJECTILE_DELAY, int speed){
        long currentTime = System.currentTimeMillis();
            if (currentTime - lastProjectileTime+20>= 16) {
                counter++;
                if (counter >=100){
                getWorld().addObject(new Proyectiles(speed), getX(), getY());
                counter = 0;
                return currentTime;
                }
            }

        return currentTime;
    }
}
 