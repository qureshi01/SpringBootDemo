package com.excelr.learningspringboot.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data //works as a getter and setter, it is a library present in lombok

@Getter
@Setter
@ToString

public class User {
    String name;
    int age;
    String address;

//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
