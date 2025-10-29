package com.svalero.CareMyPet.service;

import com.svalero.CareMyPet.domain.Caregiver;
import com.svalero.CareMyPet.repository.CaregiverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaregiverService {
    @Autowired
    private CaregiverRepository caregiverRepository;

    public void add(Caregiver caregiver) {
        caregiverRepository.save(caregiver);
    }
    public void delete(Caregiver caregiver) {

    }
    public List<Caregiver> findAll() {
        List<Caregiver> allCaregivers = caregiverRepository.findAll();
        return allCaregivers;
    }
    public Caregiver findById(long id) {
        return null;
    }

}
