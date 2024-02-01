package com.aysin.libarary;

public abstract class Person {
    private String name;

    public void whoYouAre() {

    };

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void newBook(Book book);
}
