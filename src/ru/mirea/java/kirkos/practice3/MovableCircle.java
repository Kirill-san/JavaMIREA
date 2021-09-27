package ru.mirea.java.kirkos.practice3;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString(){
        return "X: "+this.center.x+", y: "+this.center.y+", xSpeed: "+this.center.xSpeed+" ySpeed: "+this.center.ySpeed
                +" radius: "+this.radius;
    }

    @Override
    public void moveUp() {
    }

    @Override
    public void moveDown() {
    }

    @Override
    public void moveLeft() {
    }

    @Override
    public void moveRight() {
    }


}
