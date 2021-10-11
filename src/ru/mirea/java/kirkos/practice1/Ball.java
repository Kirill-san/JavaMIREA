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

    @Override
    public String toString() {
        return "Ball{" +
                "sport='" + sport + '\'' +
                ", weight=" + weight +
                ", radius=" + radius +
                '}';
    }
}
