package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IFicheClientProduitDAO;
import fr.inti.model.FicheClientProduit;


@Service
public class FicheClientProduitServiceImpl implements IFicheClientProduitService {

	
	@Autowired
	private IFicheClientProduitDAO fiche_client_produitDao;
	
	public void setFiche_client_produitDao(IFicheClientProduitDAO fiche_client_produitDao) {
		this.fiche_client_produitDao=fiche_client_produitDao;
	}

	@Override
	public void addFiche_client_produit(FicheClientProduit fiche_client_produit) {
		fiche_client_produitDao.save(fiche_client_produit);
	}

	@Override
	public void updateFiche_client_produit(FicheClientProduit fiche_client_produit) {
		fiche_client_produitDao.save(fiche_client_produit);
	}

	@Override
	public void deleteFiche_client_produit(FicheClientProduit fiche_client_produit) {
		fiche_client_produitDao.delete(fiche_client_produit);
	}

	@Override
	public List<FicheClientProduit> getAllFiche_client_produit() {
		return (List<FicheClientProduit>) fiche_client_produitDao.findAll();
	}

	@Override
	public FicheClientProduit getFiche_client_produitById(int id_fiche_client_produit) {
		return fiche_client_produitDao.findOne(id_fiche_client_produit);
	}

}
