package com.example.soringdzboot2.service;

import com.example.soringdzboot2.entity.Book;
import com.example.soringdzboot2.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }
}
