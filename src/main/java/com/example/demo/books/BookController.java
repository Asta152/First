package com.example.demo.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book_list/")
public class BookController {


    private final BookService BookService;

    @Autowired
    public BookController(BookService bookService){
        this.BookService = bookService;
    }

    @GetMapping
    public List<Book> bookList() {
        return BookService.bookList();
        }

    @PostMapping
    public void addBook(@RequestBody Book book){
        BookService.addBook(book);
    }
}