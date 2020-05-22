package com.todoapp.repository;

import com.todoapp.entity.Group;

import java.util.List;

public interface GroupRepository {
    List<Group> findByName(String name);
    Group save(Group var1);
    Group findById(String var1);
    void delete(int var1);
    List<Group> findAll();
    boolean checkEnroll(String username,String password);
}
