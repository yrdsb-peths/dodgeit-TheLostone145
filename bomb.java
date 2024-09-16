import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bomb extends Actor
{
    int moveSpeed = -5;
    public void act()
    {
        move(moveSpeed);
        if(getX() <= 0) {
            resetBomb();
            moveSpeed -= 0.25;
        }
        if(isTouching(Hero.class)) {
            SadFace sadFace= new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetBomb() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        }else {
            setLocation(600, 300);
        }
        
    }
}