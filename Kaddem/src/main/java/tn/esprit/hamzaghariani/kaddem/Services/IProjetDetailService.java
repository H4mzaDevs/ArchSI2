package tn.esprit.hamzaghariani.kaddem.Services;

import java.util.List;

import tn.esprit.hamzaghariani.kaddem.Entities.ProjetDetail;

public interface IProjetDetailService {
    public List<ProjetDetail> retrieveAllProjetDetails();

    public ProjetDetail retrieveProjetDetail(long projetDetailId);

    public ProjetDetail addProjetDetail(ProjetDetail p);

    public void removeProjetDetail(long projetDetailId);

    public ProjetDetail modifyProjetDetail(ProjetDetail projetDetail);
}
