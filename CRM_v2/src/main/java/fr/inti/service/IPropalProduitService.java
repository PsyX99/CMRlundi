package fr.inti.service;

import java.util.List;

import fr.inti.model.PropalProduit;

public interface IPropalProduitService {
	
	public void addPropal_produit(PropalProduit propal_produit);
	public void updatePropal_produit(PropalProduit propal_produit);
	public void deletePropal_produit(PropalProduit propal_produit);
	public List<PropalProduit> getAllPropal_produit();
	public PropalProduit getPropal_produitById(int id_propal_produit);
}
