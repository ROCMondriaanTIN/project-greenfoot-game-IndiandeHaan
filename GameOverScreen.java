import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{
 
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public GameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(672, 454, 1); 
        Greenfoot.start();
        this.setBackground ("flyDead.png");
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")) Greenfoot.setWorld(new TitleScreen());
    }
}