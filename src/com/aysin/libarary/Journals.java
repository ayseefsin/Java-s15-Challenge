package com.aysin.libarary;

import com.aysin.libarary.enums.Status;

import java.util.List;

public class Journals extends Book{
    public static List<Book> journalsBooks;
    public Journals(int bookId, Author author, String name, double price, Status status, int edition) {
        super(bookId, author, name, price, status, edition);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
