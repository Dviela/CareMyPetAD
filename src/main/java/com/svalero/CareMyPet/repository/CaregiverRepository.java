package com.svalero.CareMyPet.repository;

import com.svalero.CareMyPet.domain.Caregiver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaregiverRepository extends CrudRepository <Caregiver, Long> {

}
