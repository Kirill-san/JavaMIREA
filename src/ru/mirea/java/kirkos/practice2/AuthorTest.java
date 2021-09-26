package ru.mirea.java.kirkos.practice2;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {

        Author a1 = new Author("Kir.mail@yandex.ru", "Kirill", 'm');
        System.out.println(a1);

        System.out.println("author1 name: "+ a1.getName());

        Scanner in = new Scanner(System.in);

        System.out.print("Input a new mail: ");
        String toRefreshMail = in.nextLine();

        a1.setEmail(toRefreshMail);
        System.out.println(a1);
    }
}
