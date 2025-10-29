package com.svalero.CareMyPet.controller;

import com.svalero.CareMyPet.domain.Caregiver;
import com.svalero.CareMyPet.service.CaregiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CaregiverController {
    @Autowired
    private CaregiverService caregiverService;
    @GetMapping("/caregiver")
    public List<Caregiver> getAll() {
        List<Caregiver> allCaregivers = caregiverService.findAll();
        return allCaregivers;
    }

    @PostMapping("/caregiver")
    public void addCaregiver(@RequestBody Caregiver caregiver) {
        caregiverService.add(caregiver);
    }
}
