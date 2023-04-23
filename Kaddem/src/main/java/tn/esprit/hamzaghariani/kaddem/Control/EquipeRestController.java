package tn.esprit.hamzaghariani.kaddem.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.hamzaghariani.kaddem.Entities.Equipe;
import tn.esprit.hamzaghariani.kaddem.Services.IEquipeService;

@RestController
@RequestMapping("/equipe")
public class EquipeRestController {
    @Autowired
    IEquipeService equipeService;

    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        return listEquipes;
    }

    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") long equipeId) {
        Equipe equipe = equipeService.retrieveEquipe(equipeId);
        return equipe;
    }

    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.addEquipe(e);
        return equipe;
    }

    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removeEquipe(@PathVariable("equipe-id") long equipeId) {
        equipeService.removeEquipe(equipeId);
    }

    @PutMapping("/modify-equipe")
    public Equipe modifyEquipe(@RequestBody Equipe equipe) {
        Equipe updatedEquipe = equipeService.modifyEquipe(equipe);
        return updatedEquipe;
    }
}
