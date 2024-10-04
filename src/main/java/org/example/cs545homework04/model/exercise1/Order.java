package org.example.cs545homework04.model.exercise1;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="`Order`")
public class Order {
    @Id
    private int orderId;
    private LocalDate date;

    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<OrderLine> orderLine;
}
