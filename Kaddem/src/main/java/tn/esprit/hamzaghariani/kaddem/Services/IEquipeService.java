package tn.esprit.hamzaghariani.kaddem.Services;

import java.util.List;

import tn.esprit.hamzaghariani.kaddem.Entities.Equipe;

public interface IEquipeService {
    public List<Equipe> retrieveAllEquipes();

    public Equipe retrieveEquipe(long equipeId);

    public Equipe addEquipe(Equipe e);

    public void removeEquipe(long equipeId);

    public Equipe modifyEquipe(Equipe equipe);
}
