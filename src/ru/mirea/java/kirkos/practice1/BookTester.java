package ru.mirea.java.kirkos.practice1;
import java.util.Scanner;

public class BookTester {
    public static void main(String[] args) {

        //Демонстрация работы toString
        Book b1 = new Book("Kipling", "Seafarers", 420, (short) 1897);
        System.out.println(b1);

        Scanner in = new Scanner(System.in);

        //Для вывода кастомного объекта
        System.out.print("Input a author: ");
        String customAuthor = in.nextLine();

        System.out.print("Input a name: ");
        String customName = in.nextLine();

        System.out.print("Input a pages: ");
        int customPages = in.nextInt();

        System.out.print("Input a year: ");
        short customYear = in.nextShort();
        
        Book b2 = new Book(customAuthor, customName, customPages, customYear);
        System.out.println(b2);
    }
}
