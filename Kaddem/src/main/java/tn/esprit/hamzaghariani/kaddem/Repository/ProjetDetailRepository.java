package tn.esprit.hamzaghariani.kaddem.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.hamzaghariani.kaddem.Entities.ProjetDetail;

@Repository
public interface ProjetDetailRepository extends CrudRepository<ProjetDetail,Long> {
}
