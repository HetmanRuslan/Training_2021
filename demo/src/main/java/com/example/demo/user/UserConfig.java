package com.example.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner1(UserRepository userRepository){
        return args -> {
          User ruslan =  new User(
                    "Ruslan",
                    "Hetman",
                    "getman.ruslan2001@gmail.com"
          );

          User maria = new User(
                  "Maria",
                  "Satenko",
                  "maria.satenko@gmail.com"
          );
            userRepository.saveAll(
                    List.of(ruslan,maria)
            );
        };
    }

}
