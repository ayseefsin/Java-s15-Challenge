package com.aysin.libarary;

import com.aysin.libarary.enums.Status;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public abstract class Book {
    private int bookId;
    private Author author;
    private String name;
    private double price;
    private Status status;
    private int edition;
    private LocalDate dateOfPurchase;
    private Reader owner;

    public Book(int bookId, Author author, String name, double price, Status status, int edition){
        this.bookId = bookId;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        Books.booksAll.add(this);
    }

    public Book(int bookId, Author author, String name, double price, Status status, int edition, LocalDate dateOfPurchase) {
        this.bookId = bookId;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
    public Reader getOwner(){
        return this.owner;
    }
    public void changeOwner(Reader owner){
        this.owner=owner;
    }
    public Book display(){
        return this;
    }
    public void updateStatus(Status newStatus){
        this.status= newStatus;
    }

    public static void addBook(Book book){
        if(book.getClass().equals("Science")){
            Science.scienceBooks.add(book);
        }
        if(book.getClass().equals("Romans")){
            Romans.romansBooks.add(book);
        }
        if(book.getClass().equals("StudyBooks")){
            StudyBooks.studyBooks.add(book);
        }
        if(book.getClass().equals("Magazines")){
            Magazines.magazinesBooks.add(book);
        }
        if(book.getClass().equals("Journals")){
            Journals.journalsBooks.add(book);
        }
    }
    @Override
    public String toString() {
        return "bookId=" + bookId +'\n' +
               "author=" + author.getName()+'\n' +
                "name='" + name + '\n' +
                "price=" + price +'\n' +
                "status=" + status +'\n' +
                "edition=" + edition +'\n' +
                "dateOfPurchase=" + dateOfPurchase +'\n' +'\n';
    }
}
