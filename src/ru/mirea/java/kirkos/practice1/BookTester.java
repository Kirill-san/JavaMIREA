package ru.mirea.java.kirkos.practice1;

public class BookTester {
    public static void main(String[] args) {
        System.out.println("Класс 'Книга'");

        //Book b1 = new Book("Misha", 120, 2019);
        Book b1 = new Book("Misha", 120, (short) 2019);

        System.out.println(b1);
    }
}
