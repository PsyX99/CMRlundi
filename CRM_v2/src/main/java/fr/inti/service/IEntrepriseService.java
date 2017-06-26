package fr.inti.service;

import java.util.List;

import fr.inti.model.Entreprise;

public interface IEntrepriseService {
	
	public void addEntreprise(Entreprise entreprise);
	public void updateEntreprise(Entreprise entreprise);
	public void deleteEntreprise(Entreprise entreprise);
	public List<Entreprise> getAllEntreprise();
	public Entreprise getEntrepriseById(int id_entreprise);
	
	public void MAJ_famille_client();
	public void MAJ_niveau_client();
	public void choisir_moyen_com();
	public void relancer_client();
}
