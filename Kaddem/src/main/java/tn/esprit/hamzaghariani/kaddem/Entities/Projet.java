package tn.esprit.hamzaghariani.kaddem.Entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Projet" )
public class Projet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id" )
    private Long id;
    @Column( name = "sujet" )
    private String sujet;

    // One To One Bidirectionnelle
    @OneToOne(cascade = CascadeType.ALL)
    private ProjetDetail projetDetail;

    // Many To Many Bidirectionnelle
    @ManyToMany(mappedBy="projets", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

    public void setProjetDetail(ProjetDetail projetDetail) {
    }
}
