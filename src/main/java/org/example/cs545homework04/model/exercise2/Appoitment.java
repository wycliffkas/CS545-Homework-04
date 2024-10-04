package org.example.cs545homework04.model.exercise2;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Appoitment {
    @Id
    private int id;
    private String appdate;

    @Embedded
    private Payment payment;

    @OneToOne
    private Patient patient;

    @OneToOne
    private Doctor doctor;
}
