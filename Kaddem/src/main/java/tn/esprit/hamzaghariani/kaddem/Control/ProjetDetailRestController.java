package tn.esprit.hamzaghariani.kaddem.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.hamzaghariani.kaddem.Entities.ProjetDetail;
import tn.esprit.hamzaghariani.kaddem.Services.IProjetDetailService;

@RestController
@RequestMapping("/projet-detail")
public class ProjetDetailRestController {
    @Autowired
    IProjetDetailService projetDetailService;

    @GetMapping("/retrieve-all-projet-details")
    public List<ProjetDetail> getProjetDetails() {
        List<ProjetDetail> listProjetDetails = projetDetailService.retrieveAllProjetDetails();
        return listProjetDetails;
    }

    @GetMapping("/retrieve-projet-detail/{projet-detail-id}")
    public ProjetDetail retrieveProjetDetail(@PathVariable("projet-detail-id") long projetDetailId) {
        ProjetDetail projetDetail = projetDetailService.retrieveProjetDetail(projetDetailId);
        return projetDetail;
    }

    @PostMapping("/add-projet-detail")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail pd) {
        ProjetDetail projetDetail = projetDetailService.addProjetDetail(pd);
        return projetDetail;
    }

    @DeleteMapping("/remove-projet-detail/{projet-detail-id}")
    public void removeProjetDetail(@PathVariable("projet-detail-id") long projetDetailId) {
        projetDetailService.removeProjetDetail(projetDetailId);
    }

    @PutMapping("/modify-projet-detail")
    public ProjetDetail modifyProjetDetail(@RequestBody ProjetDetail projetDetail) {
        ProjetDetail updatedProjetDetail = projetDetailService.modifyProjetDetail(projetDetail);
        return updatedProjetDetail;
    }
}
