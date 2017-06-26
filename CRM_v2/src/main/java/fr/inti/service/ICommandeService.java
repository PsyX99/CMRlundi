package fr.inti.service;

import java.util.List;

import fr.inti.model.Commande;

public interface ICommandeService {
	
	public void addCommande(Commande commande);
	public void updateCommande(Commande commande);
	public void deleteCommande(Commande commande);
	public List<Commande> getAllCommande();
	public Commande getCommandeById(int id_commande);
	
	public void calc_montant_total();
	public void MAJ_statut_commande(Commande commande);
}
