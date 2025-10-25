package com.svalero.CareMyPet.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "service_booking")
public class ServiceBooking {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    //TODO Relaciones
    @Column(name = "service_id")
    private long serviceId;
    @Column(name = "pet_id")
    private long petId;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column
    private int hours;
    @Column
    private String status;
    @Column
    private float amount;
    @Column
    private String city;
    @Column(name = "is_paid")
    private boolean isPaid;
    @Column(name = "created_date")
    private LocalDate createdDate;
}
