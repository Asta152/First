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
            Bok elden_lord = new Bok(
                    1L,
                    "EldenRing",
                    91,
                    0,
                    "Miyazaki"
            );
            Bok Melina = new Bok(
                    1L,
                    "Sigma",
                    91,
                    0,
                    "Miyazaki"
            );
            bookRepository.saveAll(
                    List.of(elden_lord, Melina)
            );
        };
    }
}
