package com.svalero.CareMyPet.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    //TODO relaciones
    @Column(name = "booking_id")
    private long bookingId;
    @Column
    private int rating;
    @Column
    private String comment;
    @Column
    private boolean visible;
    @Column(name = "caregiver_reply")
    private String caregiverReply;
    @Column(name = "created_date")
    private LocalDate createdDate;
}
