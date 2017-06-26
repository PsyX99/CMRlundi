package fr.inti.service;

import java.util.List;

import fr.inti.model.Interet;

public interface IInteretService {
	
	public void addInteret(Interet interet);
	public void updateInteret(Interet interet);
	public void deleteInteret(Interet interet);
	public List<Interet> getAllInteret();
	public Interet getInteretById(int id_interet);
	
	public void MAJ_niveau_interet();
}
