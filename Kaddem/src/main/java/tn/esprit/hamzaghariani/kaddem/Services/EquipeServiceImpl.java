package tn.esprit.hamzaghariani.kaddem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.hamzaghariani.kaddem.Entities.Equipe;
import tn.esprit.hamzaghariani.kaddem.Repository.EquipeRepository;

@Service
public class EquipeServiceImpl implements IEquipeService {
    @Autowired
    private EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return (List<Equipe>) equipeRepository.findAll();
    }

    @Override
    public Equipe retrieveEquipe(long equipeId) {
        return equipeRepository.findById(equipeId).get();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public void removeEquipe(long equipeId) {
        equipeRepository.deleteById(equipeId);
    }

    @Override
    public Equipe modifyEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}
