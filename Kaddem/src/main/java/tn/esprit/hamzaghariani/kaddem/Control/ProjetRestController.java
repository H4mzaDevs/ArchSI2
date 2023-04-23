package tn.esprit.hamzaghariani.kaddem.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.hamzaghariani.kaddem.Entities.Projet;
import tn.esprit.hamzaghariani.kaddem.Services.IProjetService;

@RestController
@RequestMapping("/projet")
public class ProjetRestController {
    @Autowired
    IProjetService projetService;

    @GetMapping("/retrieve-all-projets")
    public List<Projet> getProjets() {
        List<Projet> listProjets = projetService.retrieveAllProjets();
        return listProjets;
    }

    @GetMapping("/retrieve-projet/{projet-id}")
    public Projet retrieveProjet(@PathVariable("projet-id") long projetId) {
        Projet projet = projetService.retrieveProjet(projetId);
        return projet;
    }

    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet p) {
        Projet projet = projetService.addProjet(p);
        return projet;
    }

    @DeleteMapping("/remove-projet/{projet-id}")
    public void removeProjet(@PathVariable("projet-id") long projetId) {
        projetService.removeProjet(projetId);
    }

    @PutMapping("/modify-projet")
    public Projet modifyProjet(@RequestBody Projet projet) {
        Projet updatedProjet = projetService.modifyProjet(projet);
        return updatedProjet;
    }

    @PostMapping("/ajouter-projet-et-projet-detail")
    public Projet addProjetAndProjetDetail(@RequestBody Projet p) {
        Projet projet = projetService.addProjetAndProjetDetailAndAssign(p);
        return projet;
    }

    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId,
                                             @PathVariable("projet-details-id") Long proejtDetailsId) {
        projetService.assignProjetDetailToProjet(proejtId, proejtDetailsId);
    }
}
