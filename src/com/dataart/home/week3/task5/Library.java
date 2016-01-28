package com.dataart.home.week3.task5;



/**
 * Created by Home on 26.01.2016.
 */
public class Library {
    private String libraryName;
    private MyArrayList<Book> books = new MyArrayList<Book>();
    private MyArrayList<Reader> readers = new MyArrayList<Reader>();
    private MyArrayList<Reader> blacklist = new MyArrayList<Reader>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public int listReaders() {
        for (Reader reader : readers) {
            System.out.println(reader);
        }

        return readers.size();
    }

    public int listAvailableBooks() {
        int count = 0;

        for (Book book : books) {
            if (book.getAvailable() > 0) {
                System.out.println(book);
                count++;
            }
        }
        return count;//return different availabe books
    }

    public int addBook(Book book) {
        books.add(book);
        return books.size();
    }

    public int addReader(Reader reader) {
        readers.add(reader);
        return readers.size();
    }

    public int giveBook(Book book, Reader reader) {
        if (blacklist.contains(reader) || book.getAvailable() < 1 || reader.getBooks().size() == 3) {
            System.err.println("Book can not be given for this user because ether" +
                    " we do not have this book or he have already 3 books or he is in black list");
            return -1;
        }
        book.setAvailable(book.getAvailable() - 1);
        reader.addBook(book);
        return reader.getBookCount();//return books that user have
    }

    public int listBooksGivenToReaders() {
        int count = 0;

        for (Book book : books) {
            if (book.getAvailable() < book.getTotal()) {
                System.out.println(book);
                count += book.getTotal() - book.getAvailable();
            }
        }

        return count;//return number of books given to readers
    }

    public int listReaderBooks(Reader reader) {

        for (Book book : reader.getBooks()) {
            System.out.println(book);


        }

        return reader.getBooks().size();
    }

    public int addReaderToBlackList(Reader reader) {
        blacklist.add(reader);
        return blacklist.size();
    }

    public int listBooksByAuthor(String author) {
        int sum = 0;

        for (Book book : books) {
            if (book.getAuthor() == author) {
                System.out.println(book);
                sum++;
            }
        }

        return sum;//number of diferent books writen by this author
    }

    public int listBooksFromYear(int year) {
        int sum = 0;

        for (Book book : books) {
            if (book.getYear() <= year) {
                System.out.println(book);
                sum++;
            }
        }

        return sum;//number of diferent books starting from year
    }
}
