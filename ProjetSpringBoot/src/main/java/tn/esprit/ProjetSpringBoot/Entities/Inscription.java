package tn.esprit.ProjetSpringBoot.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Inscription" )
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idInscription" )
    private Integer idInscription;
    private Long numInscription;
    private  Integer numSemaine;
}
