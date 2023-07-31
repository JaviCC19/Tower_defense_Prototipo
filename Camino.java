import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Camino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camino extends Actor
{

    public Camino() {
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
    }

    public void checkCollision() {
        Actor actor = getOneIntersectingObject(null);
        if (actor != null) {
            if (actor instanceof Troop_Base) {
                int dx = getX() - actor.getX();
                int dy = getY() - actor.getY();
                // Move the Troop_base away from the collider
                actor.setLocation(actor.getX() - dx, actor.getY() - dy);
            }
        }
    }

    public void act() {
        checkCollision();
    }
}
