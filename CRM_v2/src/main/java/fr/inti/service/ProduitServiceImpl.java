package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IProduitDAO;
import fr.inti.model.Produit;


@Service
public class ProduitServiceImpl implements IProduitService {

	
	@Autowired
	private IProduitDAO produitDao;
	
	public void setProduitDao(IProduitDAO produitDao) {
		this.produitDao=produitDao;
	}

	public void addProduit(Produit produit) {
		produitDao.save(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		produitDao.save(produit);
	}

	@Override
	public void deleteProduit(Produit produit) {
		produitDao.delete(produit);
	}

	@Override
	public List<Produit> getAllProduit() {
		return (List<Produit>) produitDao.findAll();
	}

	@Override
	public Produit getProduitById(int id_produit) {
		return produitDao.findOne(id_produit);
	}
}
