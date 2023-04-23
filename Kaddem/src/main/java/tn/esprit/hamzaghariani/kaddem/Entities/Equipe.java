package tn.esprit.hamzaghariani.kaddem.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "Equipe" )
public class Equipe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id" )
    private Long id;
    @Column( name = "nom" )
    private String nom;
    @Enumerated(EnumType.STRING)
    @Column( name = "domaine" )
    private Domaine domaine;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Projet> projets;

    public <E> List<E> getProjets() {
        return null;
    }
}
