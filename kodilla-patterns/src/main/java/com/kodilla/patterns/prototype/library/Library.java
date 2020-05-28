package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String a=null;
        String s = "Library [" + name + "]\n";
        for(Book TheBooks : books) {
            a = books.toString() + "\n";
        }
        return s+a;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook : this.getBooks()) {
            clonedLibrary.books.add(new Book(theBook.getTitle(),theBook.getAuthor(),theBook.getPublicationDate()));
        }
    return clonedLibrary;
    }
}
