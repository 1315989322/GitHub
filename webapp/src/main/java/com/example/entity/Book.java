package com.example.entity;

import java.io.Serializable;

public class Book implements Serializable {
    private String author;
    private String ISBN;
    private String bookName;



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
