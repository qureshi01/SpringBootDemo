package com.excelr.learningspringboot.controller;

import com.excelr.learningspringboot.domain.User;
import com.excelr.learningspringboot.service.PersonService;
import com.excelr.learningspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    //inversion of controller = creating object by itself

    @Autowired
    UserService userService;
    // PersonService userService1;

    @GetMapping("/users")
    //@RequestMapping(method = RequestMethod.GET, value="/users")
    public ResponseEntity <List<User>> getUsers(){ //for every api we should return proper Http response code
        //UserService userService = new UserService();
        List<User> users= userService.getUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

    @PostMapping("/user")
    //@RequestMapping(method = RequestMethod.POST, value="/user") //if user is using jst controller, this is the way implementing method
    public ResponseEntity<Void> saveUser(@RequestBody User user){
        System.out.println("Inside the controller: " + user);
        userService.saveUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
