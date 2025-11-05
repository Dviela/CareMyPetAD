package com.svalero.CareMyPet.controller;

import com.svalero.CareMyPet.domain.Caregiver;
import com.svalero.CareMyPet.exception.CaregiverNotFoundException;
import com.svalero.CareMyPet.exception.ErrorResponse;
import com.svalero.CareMyPet.service.CaregiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CaregiverController {
    @Autowired
    private CaregiverService caregiverService;
    @GetMapping("/caregivers")
    public ResponseEntity<List<Caregiver>> getAll() {
        List<Caregiver> allCaregivers = caregiverService.findAll();
        return ResponseEntity.ok(allCaregivers);
    }
    @PostMapping("/caregivers")
    public ResponseEntity<Caregiver> addCaregiver(@RequestBody Caregiver caregiver)
    {
        Caregiver newCaregiver = caregiverService.add(caregiver);
        return new ResponseEntity<>(newCaregiver, HttpStatus.CREATED);
    }
    @PutMapping("/caregivers/{id}")
    public ResponseEntity<Caregiver> modifyCaregiver(@PathVariable long id, @RequestBody Caregiver caregiver) throws CaregiverNotFoundException {
        Caregiver newCaregiver = caregiverService.modify(id, caregiver);
        return ResponseEntity.ok(newCaregiver);
    }
    @DeleteMapping("/caregivers/{id}")
    public ResponseEntity<Void> deleteCaregiver(@PathVariable long id) throws CaregiverNotFoundException {
        caregiverService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @ExceptionHandler(CaregiverNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(CaregiverNotFoundException gnfe) {
        ErrorResponse errorResponse = new ErrorResponse(404, "not-found", "The caregiver does not exist");
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
