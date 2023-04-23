package tn.esprit.hamzaghariani.kaddem.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.hamzaghariani.kaddem.Entities.Projet;

@Repository
public interface ProjetRepository extends CrudRepository<Projet,Long> {
}
