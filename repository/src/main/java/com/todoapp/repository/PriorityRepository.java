package com.todoapp.repository;

import com.todoapp.entity.Priority;
import com.todoapp.entity.User;

import java.util.List;

public interface PriorityRepository {
    List<Priority> findBydescription(String description);
    Priority save(Priority var1);
    Priority findById(int var1);
    void delete(Priority var1);
    List<Priority> findAll();

}
