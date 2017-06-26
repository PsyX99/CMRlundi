package fr.inti.service;

import java.util.List;

import fr.inti.model.Produit;

public interface IProduitService {
	
	public void addProduit(Produit produit);
	public void updateProduit(Produit produit);
	public void deleteProduit(Produit produit);
	public List<Produit> getAllProduit();
	public Produit getProduitById(int id_produit);
}
