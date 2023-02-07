package com.example.BookAuthor.Model;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String bookName;

    private int bookPagesNo;

    @ManyToOne
    @JoinColumn
    private Author author;

    public Book() {
    }

    public Book(String bookName, int bookPagesNo, Author author) {
        this.bookName = bookName;
        this.bookPagesNo = bookPagesNo;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPagesNo() {
        return bookPagesNo;
    }

    public void setBookPagesNo(int bookPagesNo) {
        this.bookPagesNo = bookPagesNo;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
