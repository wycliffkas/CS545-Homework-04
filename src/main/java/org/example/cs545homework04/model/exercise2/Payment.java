package org.example.cs545homework04.model.exercise2;

import jakarta.persistence.Embeddable;

@Embeddable
public class Payment {
    private String paydate;
    private double amount;
}
