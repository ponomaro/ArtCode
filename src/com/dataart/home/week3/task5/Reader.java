package com.dataart.home.week3.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 26.01.2016.
 */
public class Reader {
    private String name;
    private MyArrayList<Book> books = new MyArrayList<Book>();

    public Reader(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int getBookCount() {
        return books.size();
    }

    public String toString() {
        return name;
    }

    public MyArrayList<Book> getBooks() {
        return books;
    }
}
