package tn.agena3000.cloud.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kaddemproject.entities.Contrat;
import tn.agena3000.cloud.kaddemproject.repositories.ContratRespository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IContratServiceImp implements IContratServices {
private  ContratRespository contratRep;
    @Override
    public void ajouterContrat(Contrat c) {

        contratRep.save(c);
    }

    @Override
    public void updateContrat(Contrat c) {
        contratRep.save(c);

    }

    @Override
    public List<Contrat> getAllContrats() {

        return contratRep.findAll();
    }

    @Override
    public Contrat getById(Integer idContrat) {

        return contratRep.findById(idContrat).orElse(null);
    }

    @Override
    public void deleteContrat(Integer idContrat) {
contratRep.deleteById(idContrat);
    }
}
