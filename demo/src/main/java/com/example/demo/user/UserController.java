package com.example.demo.user;

import com.example.demo.address.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;

    }

    @GetMapping
    public List<User> getUser(){
        return userService.getUser();
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId")Long UserId){
        userService.deleteUser(UserId);
    }
    @PutMapping(path = {"userId"})
    public void updateUser(
            @PathVariable("userId") Long userId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false)String surname,
            @RequestParam(required = false)String email){
        userService.updateUser(userId,name,surname,email);
    }

}
