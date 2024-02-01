package com.aysin.libarary;

public class Librarian extends Person {

    private String password;

    public Librarian(String name, String password) {
        super(name);
        this.password = password;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        this.setName(name);
    }

    public boolean searchBook(Book book){
        return Library.books.contains(book);
    }

    public void verifyMember(){

    }

    public double calculateBill(){
        return 0;
    };
    public void createBill(){};

//newBook returnBook işlemi yapıyor.
    @Override
    public void newBook(Book book) {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
