package com.svalero.CareMyPet.service;

import com.svalero.CareMyPet.domain.Caregiver;
import com.svalero.CareMyPet.exception.CaregiverNotFoundException;
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
    public Caregiver modify(long id, Caregiver caregiver) throws CaregiverNotFoundException {
        Caregiver oldCaregiver = caregiverRepository.findById(id)
                .orElseThrow(CaregiverNotFoundException::new);

        //TODO cambiar por ModelMapper
        oldCaregiver.setName(caregiver.getName());
        oldCaregiver.setCity(caregiver.getCity());
        oldCaregiver.setEmail(caregiver.getEmail());
        oldCaregiver.setPhone(caregiver.getPhone());
        oldCaregiver.setHourlyRate(caregiver.getHourlyRate());
        oldCaregiver.setVerified(caregiver.isVerified());
        oldCaregiver.setRatingAverage(caregiver.getRatingAverage());
        oldCaregiver.setCreatedDate(caregiver.getCreatedDate());

        return caregiverRepository.save(oldCaregiver);
    }
    public void delete(long id) throws CaregiverNotFoundException {
        Caregiver caregiver = caregiverRepository.findById(id)
                .orElseThrow(CaregiverNotFoundException::new);
        caregiverRepository.delete(caregiver);
    }
    public List<Caregiver> findAll() {
        List<Caregiver> allCaregivers = caregiverRepository.findAll();
        return allCaregivers;
    }
    public Caregiver findById(long id) {
        return null;
    }

}
