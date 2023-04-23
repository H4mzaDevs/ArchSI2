package tn.esprit.hamzaghariani.kaddem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.hamzaghariani.kaddem.Entities.Equipe;
import tn.esprit.hamzaghariani.kaddem.Entities.Projet;
import tn.esprit.hamzaghariani.kaddem.Entities.ProjetDetail;
import tn.esprit.hamzaghariani.kaddem.Repository.EquipeRepository;
import tn.esprit.hamzaghariani.kaddem.Repository.ProjetDetailRepository;
import tn.esprit.hamzaghariani.kaddem.Repository.ProjetRepository;
@Service
public class ProjetServiceImpl implements IProjetService {
    @Autowired
    private ProjetRepository projetRepository;
    private ProjetDetailRepository projetDetailRepository;
    private EquipeRepository equipeRepository;

    @Override
    public List<Projet> retrieveAllProjets() {
        return (List<Projet>) projetRepository.findAll();
    }

    @Override
    public Projet retrieveProjet(long projetId) {
        return projetRepository.findById(projetId).get();
    }

    @Override
    public Projet addProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public void removeProjet(long projetId) {
        projetRepository.deleteById(projetId);
    }

    @Override
    public Projet modifyProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    public Projet addProjetAndProjetDetailAndAssign(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void assignProjetDetailToProjet(long proejtId, long proejtDetailsId) {
        Projet projet = projetRepository.findById(proejtId).get();
        ProjetDetail projetDetail = projetDetailRepository.findById(proejtDetailsId).get();
        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }

    public void addProjetAndProjetDetailAndAssign(Long projetId, Long projetDetailId) {
        Projet projet = projetRepository.findById(projetId).get();
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }

    public void assignProjetToEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
        equipe.getProjets().add(projet);
        equipeRepository.save(equipe);
    }

    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId) {
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
        projet.setProjetDetail(projetDetail);
        return projetRepository.save(projet);
    }

    public Projet DesaffecterProjetDetailFromProjet(Long projetId) {
        Projet projet = projetRepository.findById(projetId).get();
        projet.setProjetDetail(null);
        return projetRepository.save(projet);
    }

    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
        equipe.getProjets().remove(projet);
        equipeRepository.save(equipe);
    }


}
