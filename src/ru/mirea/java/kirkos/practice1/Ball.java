package ru.mirea.java.kirkos.practice1;

public class Ball {
    private String sport;
    private int weight;
    private int radius;

    //конструктор класса Book
    public Ball(String a, int i, int i1) {
        sport = a;
        weight = i;
        radius = i1;
    }

    public String toString(){
        return "Sport: "+this.sport+", weight: "+this.weight+", radius: "+this.radius;
    }
}
