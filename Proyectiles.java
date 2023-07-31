import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Proyectiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectiles extends Actor
{
    private int speed; // speed of the projectile
    
    public Proyectiles(int speed) {
        this.speed = speed;
    }
    
    /**
     * Act - do whatever the Proyectiles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // get the closest enemy
        Enemigos closestEnemy = getClosestEnemy();
        
        // if there is an enemy, move towards it
        if (closestEnemy != null) {
            turnTowards(closestEnemy.getX(), closestEnemy.getY());
            move(speed);
        }
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
        if (isTouching(Enemigos.class)) {
            Enemigos enemy = (Enemigos) getOneIntersectingObject(Enemigos.class);
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }
    
        }
  
    /**
     * Returns the closest enemy to this projectile
     */
    private Enemigos getClosestEnemy() {
        // get all the enemies in the world
        java.util.List<Enemigos> enemies = getWorld().getObjects(Enemigos.class);
        
        // if there are no enemies, return null
        if (enemies.isEmpty()) {
            return null;
        }
        
        // find the closest enemy
        Enemigos closestEnemy = enemies.get(0);
        int closestDistance = getDistanceTo(closestEnemy);
        for (Enemigos enemy : enemies) {
            int distance = getDistanceTo(enemy);
            if (distance < closestDistance) {
                closestEnemy = enemy;
                closestDistance = distance;
            }
        }
        
        return closestEnemy;
    }
    
    /**
     * Returns the distance between this projectile and the given actor
     */
    private int getDistanceTo(Actor actor) {
        int dx = getX() - actor.getX();
        int dy = getY() - actor.getY();
        return (int) Math.sqrt(dx * dx + dy * dy);
    }
}
