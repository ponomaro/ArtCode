package com.dataart.home.week3.task5;

/**
 * Created by Home on 26.01.2016.
 */
public class Book {
    private String author, name;
    private int available, total, year;

    public Book(String author, String name, int total, int year) {
        this.author = author;
        this.name = name;
        this.available = total;
        this.total = total;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getAvailable() {
        return available;
    }

    public int getTotal() {
        return total;
    }

    public int getYear() {
        return year;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String toString() {
        return name + " " + author + " " + year;
    }
}
