package com.example.demo.user;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

        @Autowired
        private UserRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }


    @Test
        void itShouldCheckWhenUserEmailExists() {
            String email = "getman.ruslan2001@gmail.com";
            User user = new User(
                    "Ruslan",
                    "Hetman",
                    email
            );
            underTest.save(user);

            boolean expected =  underTest.selectExistsEmail(email);

            assertThat(expected).isTrue();
        }

    @Test
    void itShouldCheckIfUserEmailDoesNotExists() {
        String email = "getman.ruslan2001@gmail.com";

        boolean expected =  underTest.selectExistsEmail(email);

        assertThat(expected).isFalse();
    }
}
