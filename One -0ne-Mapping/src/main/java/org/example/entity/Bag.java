package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bag {
    @Id
    private int bid;
    private String colour;
    private String description;
    @OneToOne
    private Student student;

    public Bag(int bid, String colour, String description, Student student) {
        this.bid = bid;
        this.colour = colour;
        this.description = description;
        this.student = student;
    }
    public Bag() {}

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
