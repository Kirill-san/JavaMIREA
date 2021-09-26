package ru.mirea.java.kirkos.practice1;

public class Book {

    private String author;
    private int pages;
    private short year;

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
}
