package fr.inti.service;

import java.util.List;

import fr.inti.model.FicheClientProduit;

public interface IFicheClientProduitService {
	
	public void addFiche_client_produit(FicheClientProduit fiche_client_produit);
	public void updateFiche_client_produit(FicheClientProduit fiche_client_produit);
	public void deleteFiche_client_produit(FicheClientProduit fiche_client_produit);
	public List<FicheClientProduit> getAllFiche_client_produit();
	public FicheClientProduit getFiche_client_produitById(int id_fiche_client_produit);
}
