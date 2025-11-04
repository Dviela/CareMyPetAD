package com.svalero.CareMyPet.controller;

import com.svalero.CareMyPet.domain.Caregiver;
import com.svalero.CareMyPet.exception.CaregiverNotFoundException;
import com.svalero.CareMyPet.service.CaregiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping("/caregiver/{id}")
    public ResponseEntity<Caregiver> modifyCaregiver(@PathVariable long id, @RequestBody Caregiver caregiver) throws CaregiverNotFoundException {
        Caregiver newCaregiver = caregiverService.modify(id, caregiver);
        return ResponseEntity.ok(newCaregiver);
    }
    @DeleteMapping("/caregiver/{id}")
    public ResponseEntity<Void> deleteCaregiver(@PathVariable long id) throws CaregiverNotFoundException {
        caregiverService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
