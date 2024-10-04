package org.example.cs545homework04.model.exercise2;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@SecondaryTable(
        name="Address",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "patient_id")
)
public class Patient {
    @Id
    private Long id;
    private String name;

    @Column(table="Address")
    private String street;
    @Column(table="Address")
    private String zip;
    @Column(table="Address")
    private String city;
}
