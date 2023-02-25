package tn.agena3000.cloud.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kaddemproject.entities.Universite;
import tn.agena3000.cloud.kaddemproject.repositories.UniversiteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUniversiteServiceImp implements IUniversiteService{
    private  UniversiteRepository universiteRepository;
    @Override
    public void ajouterUniversite(Universite universite) {
universiteRepository.save(universite);
    }

    @Override
    public void updateUniversite(Universite universite) {
universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getAllUniversite() {

        return universiteRepository.findAll();
    }

    @Override
    public Universite getById(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void deleteUniversite(Integer idUniversite) {
universiteRepository.deleteById(idUniversite);
    }
}
