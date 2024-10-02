package com.example.demo.books;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> bookList(){
        return bookRepository.findAll();
    }

    public void addBook(Book book) {
        Optional<Book> bookByName = bookRepository.findBookByName(book.getName());
        if(bookByName.isPresent()) {

            System.out.println("Nigga not this");
            throw new IllegalStateException("The book with same name exists");


        }
        bookRepository.save(book);
    }
}

