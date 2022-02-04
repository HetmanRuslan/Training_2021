package com.example.demo.address;

import com.example.demo.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AddressConfig {
 @Bean
    CommandLineRunner commandLineRunner2(AddressRepository addressRepository){
     return args -> {
        Address RuslanAddress = new Address(
                 "Lviv",
                 "Lviv",
                 77132,
                 30,
                 "Tychyny"

         );
         Address MariaAddress = new Address(
                 "Kyiv",
                 "Kyiv",
                 77133,
                 3,
                 "Shevchenka"
         );
         addressRepository.saveAll(
           List.of(RuslanAddress,MariaAddress)
         );
     };
 }
}
