package com.example.demo.user;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;



import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

class UserServiceTest {

    @Mock private UserRepository userRepository;
    private UserService underTest;

    @BeforeEach
    void setUp() {
        underTest = new UserService(userRepository);
    }


    @Test
    void canGetUser() {
        underTest.getUser();
        verify(userRepository).findAll();
    }

    @Test
    void canAddNewUser() {

        User user = new User(
                "Ruslan",
                "Hetman",
                "getman.ruslan2001@gmail.com"
        );

        underTest.addNewUser(user);

        ArgumentCaptor<User> userArgumentCaptor =
                ArgumentCaptor.forClass(User.class);

        verify(userRepository)
                .save(userArgumentCaptor.capture());

      User captureUser= userArgumentCaptor.getValue();

      assertThat(captureUser).isEqualTo(user);
    }

   /* @Test
    void willThrowWhenEmailIsTaken() {

        User user = new User(
                "Ruslan",
                "Hetman",
                "getman.ruslan2001@gmail.com"
        );
            given(userRepository.selectExistsEmail(anyString())).willReturn(true);

        assertThatThrownBy(() ->underTest.addNewUser(user))
                .isInstanceOf(IllegalStateException.class).hasMessageContaining("email "+user.getEmail()+" taken");

        verify(userRepository,never()).save(any());
    }

    @Test
    @Disabled
    void canDeleteUser() {
        User user = new User(
                "Ruslan",
                "Hetman",
                "getman.ruslan2001@gmail.com"
        );

    }
    */

}