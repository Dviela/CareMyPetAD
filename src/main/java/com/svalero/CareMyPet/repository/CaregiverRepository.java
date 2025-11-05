package com.svalero.CareMyPet.repository;

import com.svalero.CareMyPet.domain.Caregiver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaregiverRepository extends CrudRepository <Caregiver, Long> {
List<Caregiver> findAll(); //Crea un findAll que devuelve una lista
List<Caregiver> findByCity(String city);
}
