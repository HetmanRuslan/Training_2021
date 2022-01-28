package com.example.demo;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
        @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository){
        return args -> {
            Book book= new Book(
               "ItBook",
                    300,
                    "it literature",
                     "19-01-2001",
                    400,
                    1

            );
            bookRepository.save(book);
        };
        }

        @Bean
    CommandLineRunner commandLineRunner(AuthorRepository authorRepository){
        return args -> {
            Author author = new Author(
                "Ruslan",
                    "Hetman",
                    "28.11.2001",
                    "Men"
            );
            authorRepository.save(author);
        };
        }
}
