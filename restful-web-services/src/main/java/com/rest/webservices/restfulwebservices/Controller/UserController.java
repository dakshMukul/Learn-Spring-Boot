package com.rest.webservices.restfulwebservices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservices.restfulwebservices.user.User;
import com.rest.webservices.restfulwebservices.user.UserDaoService;

@RestController
public class UserController {
    
    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> findAll(){
        return userDaoService.findAllUsers();
    }

    @GetMapping("/users/{id}")
    public User findUser(@PathVariable int id){
        return userDaoService.findById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> saveUser(@RequestBody User user){
        userDaoService.saveUser(user);

        return ResponseEntity.created(null).build();
    }
}
