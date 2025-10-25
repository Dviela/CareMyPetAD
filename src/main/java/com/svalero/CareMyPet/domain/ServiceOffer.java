package com.svalero.CareMyPet.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "service_offer")
public class ServiceOffer {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    //TODO anotar que es relacionada con cuidador
    @Column(name = "caregiver_id")
    private long caregiverId;
    @Column
    private String title;
    @Column
    private String type;
    @Column
    private String description;
    @Column
    private float price;
    @Column
    private boolean active;
    @Column(name = "max_pets")
    private int maxPets;
    @Column(name = "created_date")
    private LocalDate createdDate;


}
