package com.dataart.home.week3.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 26.01.2016.
 */
public class Reader {
    private String name;
    private List<Book> books = new ArrayList<Book>();

    public Reader(String name) {
        this.name = name;
    }

    public void addBook(Book book){
        books.add(book);
    }
    public int getBookCount(){
        return books.size();
    }

    public String toString(){
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }
}
