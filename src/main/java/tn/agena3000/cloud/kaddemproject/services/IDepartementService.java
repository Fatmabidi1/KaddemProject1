package tn.agena3000.cloud.kaddemproject.services;

import tn.agena3000.cloud.kaddemproject.entities.Departement;

import java.util.List;

public interface IDepartementService {
    void ajouterDepartement(Departement departement);
    void updateDepartement(Departement d);
    List<Departement> getAllDepartement();
    Departement getById(Integer idDepartement);
    void deleteDepartement(Integer idDepartement);

    void assignUniversiteToDepartement(Integer idUniversite, Integer
            idDepartement);
}
