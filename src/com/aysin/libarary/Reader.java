package com.aysin.libarary;

import java.util.List;

public class Reader extends Person{

    private Books books;
    private String woIam;



    public Reader(String name, Books books, String woIam) {
        super(name);
        this.books = books;
        this.woIam = woIam;
    }

    @Override
    public void whoYouAre() {
        woIam="Reader";
    }
}
