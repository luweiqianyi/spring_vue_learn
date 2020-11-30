package com.example.chapter01.controller;

import com.example.chapter01.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    Book book;

    @Autowired
    public BookController(Book book) {
        this.book = book;
    }
    @GetMapping("/book")
    public String book(){
        return book.toString();
    }
}
