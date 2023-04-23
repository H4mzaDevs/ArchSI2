package tn.esprit.hamzaghariani.kaddem.Services;

import java.util.List;

import tn.esprit.hamzaghariani.kaddem.Entities.Projet;

public interface IProjetService {
    public List<Projet> retrieveAllProjets();

    public Projet retrieveProjet(long projetId);

    public Projet addProjet(Projet p);

    public void removeProjet(long projetId);

    public Projet modifyProjet(Projet projet);

    public Projet addProjetAndProjetDetailAndAssign(Projet p);

    public void assignProjetDetailToProjet(long proejtId, long proejtDetailsId);
    public void assignProjetToEquipe(Long projetId, Long equipeId);

    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId);

    public Projet DesaffecterProjetDetailFromProjet(Long projetId);

    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId);

    public void addProjetAndProjetDetailAndAssign(Long projetId, Long projetDetailId);

}
