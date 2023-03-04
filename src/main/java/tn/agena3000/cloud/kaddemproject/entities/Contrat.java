package tn.agena3000.cloud.kaddemproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table ( name = "contrat")
@Entity
@Getter
@Setter
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    private LocalDate dateDebutContrat;
    private LocalDate dateFinContrat;
    private boolean archive;
    private int montantContrat;
@ManyToOne
private Etudiant etudiant;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
}
