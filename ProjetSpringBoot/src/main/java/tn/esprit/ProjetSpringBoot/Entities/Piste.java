package tn.esprit.ProjetSpringBoot.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table ( name = "Piste" )
public class Piste implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column( name = "idPiste" )
    private Integer idPiste;
    private  Long numPiste;
    private  String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private  Integer longeur;
    private Integer pente;
}
