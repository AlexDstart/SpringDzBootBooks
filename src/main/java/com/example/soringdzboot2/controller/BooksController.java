package com.example.soringdzboot2.controller;

import com.example.soringdzboot2.entity.Book;
import com.example.soringdzboot2.service.BookService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BooksController {
    private BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/books")
    public String getBooks(Model model){
        List<Book> books = bookService.getBooks();

        model.addAttribute("booksList",books);
        return "books";
    }


    @GetMapping("/add_book")
    public String addBookGet(Model model){
        model.addAttribute("book",new Book());
        return "add_book";
    }

    @PostMapping("/add_book")
    public String addBookPost(@ModelAttribute Book book){
        bookService.addBook(book);
        return "resultAdd";
    }


}
