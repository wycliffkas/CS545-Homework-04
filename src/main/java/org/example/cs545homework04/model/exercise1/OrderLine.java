package org.example.cs545homework04.model.exercise1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderLine {
    @Id
    private int id;
    private int quantity;

    @ManyToOne
    private Product product;
}
