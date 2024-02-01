package com.aysin.libarary;

import com.aysin.libarary.Interfaces.NewBook;

import java.util.List;

public class Author extends Person implements NewBook {
private List<Book> books;
private String whoIam;


    public Author(String name, List<Book> books, String whoIam) {
        super(name);
        this.books = books;
        this.whoIam = whoIam;
    }


    public void showBooks(){
        System.out.println(this.getName() + "'s books: " + books);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getWhoIam() {
        return whoIam;
    }

    public void setWhoIam(String whoIam) {
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

    @Override
    public void newBook(Book book) {
        this.books.add(book);
        Books.booksAll.add(book);
    }
}
