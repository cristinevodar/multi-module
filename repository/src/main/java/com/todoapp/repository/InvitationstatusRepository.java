package com.todoapp.repository;

import com.todoapp.entity.Invitationstatus;
import com.todoapp.entity.Priority;

import java.util.List;

public interface InvitationstatusRepository {
    List<Invitationstatus> findBydescription(String description);
    Invitationstatus save(Invitationstatus var1);
    Invitationstatus findById(int var1);
    void delete(Invitationstatus var1);
    List<Invitationstatus> findAll();

}
