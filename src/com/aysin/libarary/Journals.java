package com.aysin.libarary;

import com.aysin.libarary.enums.Status;

public class Journals extends Book{
    public Journals(int bookId, Author author, String name, double price, Status status, int edition) {
        super(bookId, author, name, price, status, edition);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
