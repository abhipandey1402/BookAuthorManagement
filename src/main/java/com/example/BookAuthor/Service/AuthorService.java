package com.example.BookAuthor.Service;

import com.example.BookAuthor.Model.Author;
import com.example.BookAuthor.Model.Book;
import com.example.BookAuthor.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "Author Added Successfully";
    }

    public Author getAuthor() {
        List<Author> authorList = authorRepository.findAll();

        Author author1 = new Author();
        Book book2 = new Book();
        Author authorWithMaxPagesBookWritten = author1;
        Book bookWithMaxPages = book2;

        for(Author author : authorList){
            List<Book> bookList = author.getBookList();

            for(Book book : bookList){
                if(book.getBookPagesNo() > bookWithMaxPages.getBookPagesNo()){
                    bookWithMaxPages = book;
                }
            }
            bookWithMaxPages.setAuthor(author);
        }
        authorRepository.save(bookWithMaxPages.getAuthor());
        return bookWithMaxPages.getAuthor();
    }
}
