package com.example.BookAuthor.Controller;

import com.example.BookAuthor.Model.Book;
import com.example.BookAuthor.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/getBook")
    public Book getBook(){
        return bookService.getBook();
    }
}
