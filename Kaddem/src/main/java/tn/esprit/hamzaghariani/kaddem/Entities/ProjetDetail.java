package tn.esprit.hamzaghariani.kaddem.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "ProjetDetail" )
public class ProjetDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id" )
    private Long id;
    @Column( name = "description" )
    private String description;
    @Column( name = "technologie" )
    private String technologie;
    @Column( name = "cout" )
    private Long cout;
    @Column( name = "dateDebut" )
    private Date dateDebut;
    // One To One Bidirectionnelle
    @OneToOne(mappedBy="projetDetail")
    private Projet projet;

}
