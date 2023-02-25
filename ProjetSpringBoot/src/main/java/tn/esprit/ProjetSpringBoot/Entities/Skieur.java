package tn.esprit.ProjetSpringBoot.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Skieur" )
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idSkieur" )
    private Integer idSkieur;
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
}
