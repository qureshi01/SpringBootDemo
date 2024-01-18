package com.excelr.learningspringboot.service;

import com.excelr.learningspringboot.domain.User;
import com.excelr.learningspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        //UserRepository userRepository = new UserRepository();
        List<User> users= userRepository.getUsers();
        return users;
    }

    public void saveUser(User user){
        userRepository.saveUser(user);
        System.out.println("Inside service");
    }
}
