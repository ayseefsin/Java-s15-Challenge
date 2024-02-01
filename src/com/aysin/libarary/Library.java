package com.aysin.libarary;

import com.aysin.libarary.Author;
import com.aysin.libarary.Book;
import com.aysin.libarary.Books;
import com.aysin.libarary.Interfaces.NewBook;
import com.aysin.libarary.Interfaces.ShowBook;
import com.aysin.libarary.Reader;

import java.util.*;

public abstract class Library implements NewBook, ShowBook {
    Map<Reader, Books> readersBooks = new HashMap<>(){};
    Map<Author, Books> authorBooks = new HashMap<>(){};

    public static List<Book> books= (List) new ArrayList<Book>();

    public List<Book> getBooks() {
        return books;
    }

    public Reader getReader(Book book){
        return book.getOwner();
    }
    public void lendBook(Book book, Reader reader){
        this.books.remove(book);
        book.changeOwner(reader);
        System.out.println("Book "+ book.getName() + "is lended for 2 weeks to ");
    }

    public void takeBackBook(Book book){
        books.add(book);
    }


    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public void newBook(Book book) {

        Books.booksAll.add(book);
    }

    public void issueBook(){};


    @Override
    public List<Book> showBook() {
        System.out.println("Library books: " + this.getBooks());
        return this.getBooks();
    }
}