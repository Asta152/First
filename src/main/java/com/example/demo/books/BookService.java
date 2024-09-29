package com.example.demo.books;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    public List<Bok> bookList(){
        return List.of(
                new Bok(
                        1,
                        "1984",
                        270,
                        300,
                        "J.Oruel"
                ),
                new Bok(
                        2,
                        "Горжость и предубеждение",
                        383,
                        400,
                        "Jane Osten"
                )
        );
    }
}

