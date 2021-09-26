package ru.mirea.java.kirkos.practice1;

public class Book {

    private String author;
    private String name;
    private int pages;
    private short year;

    //конструктор класса Book
    public Book(String a, String a1, int i, short i1) {
        author = a;
        name = a1;
        pages = i;
        year = i1;
    }

    //сеттеры (не используются)
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(short year) {
        this.year = year;
    }

    //toString
    public String toString(){
        return "Author: "+this.author+", name: "+this.name+", pages: "+this.pages+", year: "+this.year;
    }
}
