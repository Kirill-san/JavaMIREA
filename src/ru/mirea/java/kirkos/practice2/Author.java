package ru.mirea.java.kirkos.practice2;

public class Author {
    private String email;
    private String name;
    private char gender;

    //конструктор класса Author
    public Author(String a, String a1, char b) {
        email = a;
        name = a1;
        gender = b;
    }

    //геттеры
    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    //сеттер
    public void setEmail(String email) {
        this.email = email;
    }
    //toString
    public String toString(){
        return this.name+" ("+this.gender+") at "+this.email;
    }
}
