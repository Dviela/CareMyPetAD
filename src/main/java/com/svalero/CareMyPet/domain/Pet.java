package com.svalero.CareMyPet.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pet")
public class Pet {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String species;
    @Column
    private String breed;
    @Column
    private String size;
    @Column(name = "weight")
    private float weightKg;
    @Column
    private boolean vaccinated;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "created_date")
    private LocalDate createdDate;
}
