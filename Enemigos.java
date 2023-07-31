import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;



public class Enemigos extends Actor {
    private int speed = 1;
    private int currentPathIndex = 0;
    private List<Camino> path;
    private boolean pressed = false;
    
    public Enemigos(List<Camino> path) {
        this.path = path;
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("space") || pressed) {
            pressed = true;
            moveAlongPath();
        }
    }
    
    private void moveAlongPath() {
        if (currentPathIndex >= path.size()) {
            // End of path reached
            getWorld().removeObject(this);
            return;
        }
        
        Camino currentPath = path.get(currentPathIndex);
        if (intersects(currentPath)) {
            currentPathIndex++;
        } else {
            turnTowards(currentPath.getX()+75, currentPath.getY()+75);
            move(speed);
        }
    }
}