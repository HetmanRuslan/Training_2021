package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User>getUser(){
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userOptional= userRepository
                .findUserByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw  new IllegalStateException("email taken");
        }
        userRepository.save(user);
    }

    public void deleteUser(Long UserId) {
        boolean exists =userRepository.existsById(UserId);
        if(!exists){
            throw new IllegalStateException("User with id"+UserId+ "does not exists");
        }
        userRepository.deleteById(UserId);
    }
    @Transactional
    public void updateUser(Long userId,
                           String name,
                           String surname,
                           String email) {
        User user = userRepository.findById(userId).orElseThrow(()->new IllegalStateException(
                "User with id"+userId+"does not exist"));

            if(name!=null&&name.length()>0 && !Objects.equals(user.getName(),name)){
                user.setName(name);
            }
            if(surname!=null&&surname.length()>0 && !Objects.equals(user.getSurname(), surname)) {
                user.setSurname(surname);
            }
            if(email!=null&&email.length()>0 && !Objects.equals(user.getEmail(), email)) {
                Optional<User> userOptional = userRepository.findUserByEmail(email);
                if (userOptional.isPresent()){
                    throw new IllegalStateException("email taken");
                }
                user.setEmail(email);
            }

        }
    }
