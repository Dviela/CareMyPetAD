package com.svalero.CareMyPet.controller;

import com.svalero.CareMyPet.domain.Caregiver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CaregiverController {
    @GetMapping("/caregiver")
    public List<Caregiver> getAll() {
        return null;
    }

    @PostMapping("/caregiver")
    public void addCaregiver() {


    }
}
