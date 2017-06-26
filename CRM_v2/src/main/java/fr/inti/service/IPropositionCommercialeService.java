package fr.inti.service;

import java.util.List;

import fr.inti.model.Proposition_commerciale;

public interface IPropositionCommercialeService {
	
	public void addProposition_commerciale(Proposition_commerciale proposition_commerciale);
	public void updateProposition_commerciale(Proposition_commerciale proposition_commerciale);
	public void deleteProposition_commerciale(Proposition_commerciale proposition_commerciale);
	public List<Proposition_commerciale> getAllProposition_commerciale();
	public Proposition_commerciale getProposition_commercialeById(int id_proposition_commerciale);
	
	public void calcul_montant_total();
	public void MAJ_status_propal(Proposition_commerciale proposition_commerciale);
}
