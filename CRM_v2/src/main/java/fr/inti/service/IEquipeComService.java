package fr.inti.service;

import java.util.List;

import fr.inti.model.EquipeCom;
import fr.inti.model.RespCommercial;

public interface IEquipeComService {
	
	public void addEquipe_com(EquipeCom equipe_com);
	public void updateEquipe_com(EquipeCom equipe_com);
	public void deleteEquipe_com(EquipeCom equipe_com);
	public List<EquipeCom> getAllEquipe_com();
	public EquipeCom getEquipe_comById(int id_equipe_com);
	
	public void definir_equipe();
	public RespCommercial attribuer_responsable (EquipeCom equipe_com);
}
