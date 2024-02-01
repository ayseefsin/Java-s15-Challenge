package com.aysin.libarary;

import com.aysin.libarary.enums.Status;

import java.time.LocalDate;
import java.util.List;

public class Romans extends Book{
    public static List<Book> romansBooks;
    public Romans(int bookId, Author author, String name, double price, Status status, int edition, LocalDate localDate) {
        super(bookId, author, name, price, status, edition , localDate );
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
