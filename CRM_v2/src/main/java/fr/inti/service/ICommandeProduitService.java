package fr.inti.service;

import java.util.List;

import fr.inti.model.CommandeProduit;

public interface ICommandeProduitService {
	
	public void addCommande_produit(CommandeProduit commande_produit);
	public void updateCommande_produit(CommandeProduit commande_produit);
	public void deleteCommande_produit(CommandeProduit commande_produit);
	public List<CommandeProduit> getAllCommande_produit();
	public CommandeProduit getCommande_produitById(int id_commande_produit);
	
	public void chosir_taux_reduction(CommandeProduit commande_produit);
}
