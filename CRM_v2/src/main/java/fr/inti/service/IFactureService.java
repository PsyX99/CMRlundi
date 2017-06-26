package fr.inti.service;

import java.util.List;

import fr.inti.model.Facture;

public interface IFactureService {
	
	public void addFacture(Facture facture);
	public void updateFacture(Facture facture);
	public void deleteFacture(Facture facture);
	public List<Facture> getAllFacture();
	public Facture getFactureById(int id_facture);
	
	public void affecter_reglement();
	public void MAJ_nb_relances();
	
}
