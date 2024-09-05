package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import org.example.entity.Bag;

@Entity
public class Student {
    @Id
    private int sid;
    private String name;
    private String address;

    public Student(int sid, String name, String address) {
        this.sid = sid;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
