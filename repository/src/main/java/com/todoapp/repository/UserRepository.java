package com.todoapp.repository;

import com.todoapp.entity.User;

import java.util.List;

public interface UserRepository {
    List<User> findByUsername(String username);
    User save(User var1);
    User findById(int var1);
    void delete(User var1);
    List<User> findAll();
    boolean checkLogin(String username,String password);
}

//sa nu extinda nimic
//crud find all si findbyID
// in java punem package-ul com.todoapp