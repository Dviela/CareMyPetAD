package com.svalero.CareMyPet.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "caregiver")
public class Caregiver {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String city;
    @Column
    private String email;
    @Column
    private String phone;
    @Column(name = "hourly_rate")
    private float hourlyRate;
    @Column
    private boolean verified;
    @Column(name = "rating_average")
    private float ratingAverage;
    @Column(name = "created_date")
    private LocalDate createdDate;
}
