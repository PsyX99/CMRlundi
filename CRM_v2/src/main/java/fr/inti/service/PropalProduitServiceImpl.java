package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IPropalProduitDAO;
import fr.inti.model.PropalProduit;


@Service
public class PropalProduitServiceImpl implements IPropalProduitService {

	
	@Autowired
	private IPropalProduitDAO propal_produitDao;
	
	public void setPropal_produitDao(IPropalProduitDAO propal_produitDao) {
		this.propal_produitDao=propal_produitDao;
	}

	@Override
	public void addPropal_produit(PropalProduit propal_produit) {
		propal_produitDao.save(propal_produit);
	}

	@Override
	public void updatePropal_produit(PropalProduit propal_produit) {
		propal_produitDao.save(propal_produit);
	}

	@Override
	public void deletePropal_produit(PropalProduit propal_produit) {
		propal_produitDao.delete(propal_produit);
	}

	@Override
	public List<PropalProduit> getAllPropal_produit() {
		return (List<PropalProduit>) propal_produitDao.findAll();
	}

	@Override
	public PropalProduit getPropal_produitById(int id_propal_produit) {
		return propal_produitDao.findOne(id_propal_produit);
	}

}
