package com.excelr.learningspringboot.repository;

import com.excelr.learningspringboot.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> list = new ArrayList<>();
    public List<User> getUsers(){
        return list;
    }

    public void saveUser(User user) {
        System.out.println("Inside the repo");

        //code to insert user data inside the database
        list.add(user);
        System.out.println("Data Saved");
    }
}
