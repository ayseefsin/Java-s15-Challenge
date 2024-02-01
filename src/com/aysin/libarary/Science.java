package com.aysin.libarary;

import com.aysin.libarary.enums.Status;

import java.time.LocalDate;

public class Science extends Book{
    public Science(int bookId, Author author, String name, double price, Status status, int edition) {
        super(bookId, author, name, price, status, edition);
    }

    public Science(int bookId, Author author, String name, double price, Status status, int edition, LocalDate dateOfPurchase) {
        super(bookId, author, name, price, status, edition, dateOfPurchase);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
