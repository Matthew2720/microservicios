package com.mateo.microservicios.microservicios.Model;

import jakarta.persistence.*;
@Entity
@Table
public class veterinary_pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="namepet")
    private String namepet;
    @Column
    private String species;
    @Column
    private int client_id;
    @Column
    private String birthdate;
    @Column
    private String gender;


    public veterinary_pet() {
    }

    public veterinary_pet(Integer id, String namepet, String species, int client_id, String birthdate, String gender) {
        this.id = id;
        this.namepet = namepet;
        this.species = species;
        this.client_id = client_id;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamepet() {
        return namepet;
    }

    public void setNamepet(String namepet) {
        this.namepet = namepet;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
