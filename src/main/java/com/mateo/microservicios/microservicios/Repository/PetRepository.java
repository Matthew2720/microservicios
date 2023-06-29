package com.mateo.microservicios.microservicios.Repository;

import com.mateo.microservicios.microservicios.Model.veterinary_pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository <veterinary_pet, Integer> {
}
