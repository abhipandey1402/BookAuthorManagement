package com.example.BookAuthor.Controller;

import com.example.BookAuthor.Model.Author;
import com.example.BookAuthor.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @GetMapping("/getAuthor")
    public Author getAuthor(){
        return authorService.getAuthor();
    }
}
