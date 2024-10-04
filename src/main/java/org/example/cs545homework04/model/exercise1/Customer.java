package org.example.cs545homework04.model.exercise1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstname;
    private String lastname;

    @OneToMany
    private List<Order> order;
}
