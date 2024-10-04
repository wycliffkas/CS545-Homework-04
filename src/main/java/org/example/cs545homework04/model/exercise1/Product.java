package org.example.cs545homework04.model.exercise1;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
}
