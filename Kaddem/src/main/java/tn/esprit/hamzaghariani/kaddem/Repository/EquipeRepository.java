package tn.esprit.hamzaghariani.kaddem.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.hamzaghariani.kaddem.Entities.Equipe;

@Repository
public interface EquipeRepository extends CrudRepository<Equipe,Long> {
}
