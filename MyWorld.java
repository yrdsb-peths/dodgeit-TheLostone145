import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        super(600, 400, 1); 
        bomb bomb = new bomb();
        addObject(bomb, 600, 100);
        Hero hero = new Hero();
        addObject(hero,100,100);
    }
}
