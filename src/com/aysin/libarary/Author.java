package com.aysin.libarary;

import java.util.List;
import java.util.Scanner;

public class Author extends Person{
private Books books;
private String whoIam;


    public Author(String name, Books books, String whoIam) {
        super(name);
        this.books = books;
        this.whoIam = whoIam;
    }

    @Override
    public void whoYouAre() {
        whoIam="Author";
    }

    @Override
    public String toString() {
        return "Author{" +
                "books=" + books +
                ", whoIam='" + whoIam + '\'' +
                '}';
    }
}
