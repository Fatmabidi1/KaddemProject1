package tn.agena3000.cloud.kaddemproject.services;

import tn.agena3000.cloud.kaddemproject.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    void ajouterUniversite(Universite universite);
    void updateUniversite(Universite universite);
    List<Universite> getAllUniversite();
    Universite getById(Integer idUniversite);
    void deleteUniversite(Integer idUniversite);
}
