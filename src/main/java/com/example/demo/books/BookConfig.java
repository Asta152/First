package com.example.demo.books;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            BookRepository bookRepository){
        return args -> {
            Book elden_lord = new Book(
                    "EldenRing",
                    29,
                    91,
                    "Miyazaki"
            );
            Book Melina = new Book(
                    "Melina",
                    236,
                    91,
                    "Miyazaki"
            );
            bookRepository.saveAll(
                    List.of(elden_lord, Melina)
            );
        };
    }
}
