package com.example.demo.books;

import jakarta.persistence.*;
@Entity
@Table
public class Bok{
    @Id
    @SequenceGenerator(
            name = "books",
            sequenceName = "books",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "books"
    )

    private Long id;
    private String name;
    private int pages;
    private float price;
    private String author;
    public Bok(){

    }
    public Bok(Long id, String name, int pages, float price, String author){
            this.id = id;
            this.name = name;
            this.pages = pages;
            this.author = author;
    }
    public Bok(String name, int pages, String author){
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bok{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}

