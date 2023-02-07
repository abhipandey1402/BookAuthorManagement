package com.example.BookAuthor.Service;

import com.example.BookAuthor.Model.Book;
import com.example.BookAuthor.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;


    public String addBook(Book book) {
        bookRepository.save(book);
        return "Book Added Successfully";
    }

    public Book getBook() {
        List<Book> bookList = bookRepository.findAll();
        Book book1 = new Book();

        Book bookWithMaxPages = book1;
        for(Book book : bookList){
            if(book.getBookPagesNo() > bookWithMaxPages.getBookPagesNo()){
                bookWithMaxPages = book;
            }
            bookWithMaxPages.setAuthor(book.getAuthor());
        }

        return bookWithMaxPages;
    }
}
