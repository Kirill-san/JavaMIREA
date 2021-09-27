package ru.mirea.java.kirkos.practice3;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(14, 7, 4, 8);
        System.out.println(mp);

        MovableCircle mc = new MovableCircle(67, 27, 3, 3, 10);
        System.out.println(mc);
    }
}