package com.aysin.libarary;

import com.aysin.libarary.Interfaces.ShowBook;

import java.util.List;

public class Reader extends Person implements ShowBook {

    private List<Book> books;
    private String woIam;


    public Reader(String name, List<Book> books, String woIam) {
        super(name);
        this.books = books;
        this.woIam = woIam;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getWoIam() {
        return woIam;
    }

    public void setWoIam(String woIam) {
        this.woIam = woIam;
    }

    public void purchaseBook(Book book){
        if(book.getOwner()==null){
            book.changeOwner(this);
        }
        this.books.add(book);
        book.getAuthor().getBooks().remove(book);
        System.out.println("You buy the " + book.getName() + " book from the Aysin Library");
    }
    public void borrowBook(Book book){
       if(book.getOwner()==null){
           book.changeOwner(this);
       }
        book.getAuthor().getBooks().remove(book);
        System.out.println("You barrow the " + book.getName() + " book from the Aysin Library");
    }
    public void returnBook(Book book){
        if(this.books.contains(book)){
            this.books.remove(book);
            System.out.println("You returned the book " + book.getName()+" successfully");
            book.getAuthor().newBook(book);
            book.changeOwner(null);

        }
    }



    @Override
    public void whoYouAre() {
        woIam="Reader";
    }

    @Override
    public String toString() {
        return "Reader{" +
                "books=" + books +
                ", woIam='" + woIam + '\'' +
                '}';
    }

    @Override
    public void newBook(Book book) {

        this.books.add(book);
        Books.booksAll.add(book);
    }

    @Override
    public List<Book> showBook() {
        System.out.println( this.getName()+ " books are: " + this.books);
        return this.books;
    }
}
