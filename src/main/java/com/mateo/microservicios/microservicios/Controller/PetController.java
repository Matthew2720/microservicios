package com.mateo.microservicios.microservicios.Controller;

import com.mateo.microservicios.microservicios.Model.veterinary_pet;
import com.mateo.microservicios.microservicios.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.DELETE} ,allowedHeaders = "Content-Type")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping(value = "/pets")
    public List<veterinary_pet> getPets(){

        return petRepository.findAll();
    }

    @PostMapping(value = "/savePet")
    @CrossOrigin(origins = "*", allowedHeaders = "Content-Type")
    public String savePet(@RequestBody veterinary_pet pet){
        petRepository.save(pet);
        return "Mascota guardada";
    }

    @PutMapping(value = "/update/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "Content-Type")
    public String updatePet(@PathVariable Integer id, @RequestBody veterinary_pet pet){
        veterinary_pet updatePet = petRepository.findById(id).get();
        updatePet.setNamepet(pet.getNamepet());
        updatePet.setSpecies(pet.getSpecies());
        updatePet.setClient_id(pet.getClient_id());
        updatePet.setBirthdate(pet.getBirthdate());
        updatePet.setGender(pet.getGender());
        petRepository.save(updatePet);
        return "Mascota actualizada";
    }

    @DeleteMapping(value = "/delete/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "Content-Type")
    public String deletePet(@PathVariable Integer id){
        veterinary_pet deletePet = petRepository.findById(id).get();
        petRepository.delete(deletePet);
        return "Mascota eliminada";
    }
}
