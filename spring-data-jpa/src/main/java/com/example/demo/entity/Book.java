package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Book")
@Table(name = "book,")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idbook;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private String dateOfpublications;
    @Column(nullable = false)
    private int numbers;
    @Column(nullable = false)
    private int idauthor;


    public Book(String name,
                int price,
                String genre,
                String dateOfpublications,
                int numbers,
                int idauthor)
    {
        this.name = name;
        this.price = price;
        this.genre = genre;
        this.dateOfpublications = dateOfpublications;
        this.numbers = numbers;
        this.idauthor = idauthor;
    }

    public long getIdbook() {
        return idbook;
    }

    public void setIdbook(long idbook) {
        this.idbook = idbook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDateOfpublications() {
        return dateOfpublications;
    }

    public void setDateOfpublications(String dateOfpublications) {
        this.dateOfpublications = dateOfpublications;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int getIdauthor() {
        return idauthor;
    }

    public void setIdauthor(int idauthor) {
        this.idauthor = idauthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idbook=" + idbook +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", dateOfpublications=" + dateOfpublications +
                ", numbers=" + numbers +
                ", idauthor=" + idauthor +
                '}';
    }
}
