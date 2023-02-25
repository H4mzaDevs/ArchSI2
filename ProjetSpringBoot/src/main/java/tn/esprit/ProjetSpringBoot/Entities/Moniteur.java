package tn.esprit.ProjetSpringBoot.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Moniteur" )
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idMoniteur" )
    private Integer idMoniteur;
    private  Long numMoniteur;
    private  String nomM;
    private  String prenomM;
    private Date dateRecru;
}
