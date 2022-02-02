package com.springsecurityapp.service;

import com.springsecurityapp.model.User;


public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
