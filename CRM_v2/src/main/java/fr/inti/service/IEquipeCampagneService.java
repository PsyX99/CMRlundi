package fr.inti.service;

import java.util.List;

import fr.inti.model.EquipeCampagne;

public interface IEquipeCampagneService {
	
	public void addEquipe_campagne(EquipeCampagne equipe_campagne);
	public void updateEquipe_campagne(EquipeCampagne equipe_campagne);
	public void deleteEquipe_campagne(EquipeCampagne equipe_campagne);
	public List<EquipeCampagne> getAllEquipe_campagne();
	public EquipeCampagne getEquipe_campagneById(int id_equipe_campagne);
}
