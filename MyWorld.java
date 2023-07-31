import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{


    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        List<Camino> caminos = getObjects(Camino.class);

        for (int i = 0; i<5; i++)
        {
            Camino camino = new Camino();
            addObject(camino, 100, 50*i);
            caminos.add(camino);
        }
        for (int i = 0; i < 8; i++) {
            Camino camino = new Camino();
            addObject(camino, 100 + i * 50, 200);
            caminos.add(camino);
        }
        Camino camino_alt = new Camino();
        addObject(camino_alt, 450, 50 * 1+200);
        for (int i = 0; i < 4; i++) {
            Camino camino = new Camino();
            addObject(camino, 500, 50 * i+200);
            caminos.add(camino);
        }
        addObject(new Objetivo(), 500, 50 * 3 + 200);
        addObject(new DPS_towoer(), 150, 300);
        addObject(new Bomb_subclass(), 300,100);
        addObject(new Tank_tower(), 400,100);
        addObject(new Enemigos(caminos), 100, 10);
        addObject(new Enemigos(caminos), 100, 20);
        addObject(new Enemigos(caminos), 100, 30);
        addObject(new Enemigos(caminos), 100, 40);
    }


}
