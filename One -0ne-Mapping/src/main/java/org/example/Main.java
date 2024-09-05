package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Bag;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Student student1 = new Student(001,"Rashmika","Gampaha");
        Bag bag1 = new Bag(1,"Red","hp bag",student1);
        session.save(student1);
        session.save(bag1);
        transaction.commit();
        session.close();

    }
}