package com.aysin.libarary;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> booksAll=new ArrayList<>() ;

    public Books(List<Book> books) {
        Books.booksAll = books;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
