package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.ICommandeProduitDAO;
import fr.inti.model.CommandeProduit;


@Service
public class CommandeProduitServiceImpl implements ICommandeProduitService {

	
	@Autowired
	private ICommandeProduitDAO commande_produitDao;
	
	public void setCommande_produitDao(ICommandeProduitDAO commande_produitDao) {
		this.commande_produitDao=commande_produitDao;
	}

	@Override
	public void addCommande_produit(CommandeProduit commande_produit) {
		commande_produitDao.save(commande_produit);
	}

	@Override
	public void updateCommande_produit(CommandeProduit commande_produit) {
		commande_produitDao.save(commande_produit);
	}

	@Override
	public void deleteCommande_produit(CommandeProduit commande_produit) {
		commande_produitDao.delete(commande_produit);
	}

	@Override
	public List<CommandeProduit> getAllCommande_produit() {
		return (List<CommandeProduit>) commande_produitDao.findAll();
	}

	@Override
	public CommandeProduit getCommande_produitById(int id_commande_produit) {
		return commande_produitDao.findOne(id_commande_produit);
	}

	@Override
	public void chosir_taux_reduction(CommandeProduit commande_produit) {
		// TODO Auto-generated method stub
		
	}

}
