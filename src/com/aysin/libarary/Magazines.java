package com.aysin.libarary;

import com.aysin.libarary.enums.Status;

import java.util.List;

public class Magazines extends Book{

    public static List<Book> magazinesBooks;
    public Magazines(int bookId, Author author, String name, double price, Status status, int edition) {
        super(bookId, author, name, price, status, edition);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
