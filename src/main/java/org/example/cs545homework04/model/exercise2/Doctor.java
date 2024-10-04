package org.example.cs545homework04.model.exercise2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Doctor {
    @Id
    private int id;

    @Column(name="type")
    private String doctortype;
    private String firstname;
    private String lastname;
}
