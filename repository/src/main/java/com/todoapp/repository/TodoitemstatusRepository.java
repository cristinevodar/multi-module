package com.todoapp.repository;


import com.todoapp.entity.Todoitemstatus;

import java.util.List;

public interface TodoitemstatusRepository {
    List<Todoitemstatus> findBydescription(String description);
    Todoitemstatus save(Todoitemstatus var1);
    Todoitemstatus findById(int var1);
    void delete(Todoitemstatus var1);
    List<Todoitemstatus> findAll();
}
