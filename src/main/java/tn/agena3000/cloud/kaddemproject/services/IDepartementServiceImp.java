package tn.agena3000.cloud.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kaddemproject.entities.Departement;
import tn.agena3000.cloud.kaddemproject.entities.Universite;
import tn.agena3000.cloud.kaddemproject.repositories.DepartementRepository;
import tn.agena3000.cloud.kaddemproject.repositories.UniversiteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IDepartementServiceImp implements IDepartementService{

    private DepartementRepository departementRepository;
    private UniversiteRepository universiteRepository;
    @Override
    public void ajouterDepartement(Departement departement) {
departementRepository.save(departement);
    }

    @Override
    public void updateDepartement(Departement d) {
departementRepository.save(d);
    }

    @Override
    public List<Departement> getAllDepartement() {

        return departementRepository.findAll();
    }

    @Override
    public Departement getById(Integer idDepartement) {

        return departementRepository.findById(idDepartement).orElse(null);
    }

    @Override
    public void deleteDepartement(Integer idDepartement) {
        departementRepository.deleteById(idDepartement);

    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        departement.setUniversite(universite);
        departementRepository.save(departement);
    }
}
