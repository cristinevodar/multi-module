package com.todoapp.entity;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Priority {
    @Id
    private int id;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", description='" + description  +
                '}';
    }

}
