package ru.mirea.java.kirkos.practice1;

public class Book {

    private String author;
    private int pages;
    private short year;

    //конструктор класса Book
    public Book(String a, int i, short i1) {
        author = a;
        pages = i;
        year = i1;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getAuthor () {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public short getYear() {
        return year;
    }

    public String toString(){
        return this.author+", pages "+this.pages+", year "+this.year;
    }
}
