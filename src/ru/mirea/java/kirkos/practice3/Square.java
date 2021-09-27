package ru.mirea.java.kirkos.practice3;

public class Square extends Rectangle {
    public Square(){
        this.filled = false;
        this.color = "BLUE";
        this.width = 7;
        this.length = 7;
    }

    public Square(double side){
        this.filled = false;
        this.color = "BLUE";
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.width + ", color: " + this.color;
    }
}
