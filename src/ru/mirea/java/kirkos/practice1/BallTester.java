package ru.mirea.java.kirkos.practice1;

import java.util.Scanner;

public class BallTester {
    public static void main(String[] args) {
        //Демонстрация работы toString
        Ball ball1 = new Ball("Volleyball", 1400, 21);
        System.out.println(ball1);

        Scanner in = new Scanner(System.in);

        //Для вывода кастомного объекта
        System.out.print("Input a sport: ");
        String customSport = in.nextLine();

        System.out.print("Input a weight: ");
        int customWeight = in.nextInt();

        System.out.print("Input a radius: ");
        int customRadius = in.nextInt();

        Ball ball2 = new Ball(customSport, customWeight, customRadius);
        System.out.println(ball2);
    }
}
