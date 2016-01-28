package com.dataart.home.week3.task5;

/**
 * Created by Home on 26.01.2016.
 */
public class TestLibrary {
    public static void main(String[] args) {


        Book book1 = new Book("Author1", "Bookname1", 3, 2014);
        Book book2 = new Book("Author2", "Bookname2", 1, 2015);
        Book book3 = new Book("Author3", "Bookname3", 5, 2010);
        Book book4 = new Book("Author3", "Bookname4", 5, 2010);
        Reader reader1 = new Reader("Reader1");
        Reader reader2 = new Reader("Reader2");
        Reader reader3 = new Reader("Reader3");
        Library lib = new Library("LibraryName");
        lib.addReader(reader1);

        int addread = lib.addReader(reader2);
        System.out.println("addReader: " + (addread == 2));


        int listread = lib.listReaders();
        System.out.println("listReaders: " + (listread == 2));

        int listaddb = lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        System.out.println("addBook: " + (listaddb == 1));

        int giveb = lib.giveBook(book2, reader1);
        System.out.println("giveBook: " + (giveb == 1));

        int listavbook = lib.listAvailableBooks();
        System.out.println("listAvailableBooks: " + (listavbook == 3));

        int listbooksgiven = lib.listBooksGivenToReaders();
        System.out.println("listBooksGivenToReaders: " + (listbooksgiven == 1));

        int listreaderbook = lib.listReaderBooks(reader1);
        System.out.println("listReaderBooks: " + (listreaderbook == 1));

        lib.addReaderToBlackList(reader1);
        int blockuser = lib.giveBook(book1, reader1);
        System.out.println(blockuser);
        System.out.println("addReaderToBlackList: " + (blockuser == -1));

        int listBookAuthor = lib.listBooksByAuthor("Author3");
        System.out.println("listBooksByAuthor: " + (listBookAuthor == 2));

        int listBookFromYear = lib.listBooksFromYear(2013);
        System.out.println("listBooksFromYear: " + (listBookFromYear == 2));
    }
}
