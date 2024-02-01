package com.aysin.libarary;

import com.aysin.libarary.Interfaces.ShowBook;

import java.util.List;

import static com.aysin.libarary.Library.books;

public class Reader extends Person implements ShowBook {

    private List<Book> booksReader;
    private String woIam;


    public Reader(String name, List<Book> books, String woIam) {
        super(name);
        this.booksReader = books;
        this.woIam = woIam;
    }

    public List<Book> getBooks() {
        return booksReader;
    }

    public void setBooks(List<Book> books) {
        this.booksReader = books;
    }

    public String getWoIam() {
        return woIam;
    }

    public void setWoIam(String woIam) {
        this.woIam = woIam;
    }

    public void purchaseBook(Book book){
        if(books.contains(book)){
            if(book.getOwner()==null){
                book.changeOwner(this);
                book.getAuthor().getBooks().remove(book);
                books.remove(book);
                booksReader.add(book);
                System.out.println("You buy the " + book.getName() + " book from the Aysin Library");
            }
        }else{
            System.out.println("This book " +book.getName() + " is not available right now! Try again later!");}


    }
    public void borrowBook(Book book){
        if(books.contains(book)){
            if(book.getOwner()==null){
                book.changeOwner(this);
                book.getAuthor().getBooks().remove(book);
                books.remove(book);
                booksReader.add(book);
                System.out.println("You barrow the " + book.getName() + " book from the Aysin Library");
            }
        }else{
            System.out.println("This book " +book.getName() + " is not available right now! Try again later!");}


    }
    public void returnBook(Book book){
        if(this.booksReader.contains(book)){
            this.booksReader.remove(book);
            books.add(book);
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

        this.booksReader.add(book);
        Books.booksAll.add(book);
    }

    @Override
    public List<Book> showBook() {
        System.out.println( this.getName()+ " books are: " + this.booksReader);
        return this.booksReader;
    }
}
