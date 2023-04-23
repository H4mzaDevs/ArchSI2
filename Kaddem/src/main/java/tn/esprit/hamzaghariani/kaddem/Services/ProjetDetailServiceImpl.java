package tn.esprit.hamzaghariani.kaddem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.hamzaghariani.kaddem.Entities.ProjetDetail;
import tn.esprit.hamzaghariani.kaddem.Repository.ProjetDetailRepository;

@Service
public class ProjetDetailServiceImpl implements IProjetDetailService {

    @Autowired
    private ProjetDetailRepository projetDetailRepository;

    @Override
    public List<ProjetDetail> retrieveAllProjetDetails() {
        return (List<ProjetDetail>) projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail retrieveProjetDetail(long projetDetailId) {
        return projetDetailRepository.findById(projetDetailId).get();
    }

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail p) {
        return projetDetailRepository.save(p);
    }

    @Override
    public void removeProjetDetail(long projetDetailId) {
        projetDetailRepository.deleteById(projetDetailId);
    }

    @Override
    public ProjetDetail modifyProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }
}
