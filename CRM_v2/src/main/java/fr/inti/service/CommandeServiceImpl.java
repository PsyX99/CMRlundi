package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.ICommandeDAO;
import fr.inti.model.Commande;


@Service
public class CommandeServiceImpl implements ICommandeService {

	
	@Autowired
	private ICommandeDAO commandeDao;
	
	public void setCommandeDao(ICommandeDAO commandeDao) {
		this.commandeDao=commandeDao;
	}

	@Override
	public void addCommande(Commande commande) {
		commandeDao.save(commande);
	}

	@Override
	public void updateCommande(Commande commande) {
		commandeDao.save(commande);
	}

	@Override
	public void deleteCommande(Commande commande) {
		commandeDao.delete(commande);
	}

	@Override
	public List<Commande> getAllCommande() {
		return (List<Commande>) commandeDao.findAll();
	}

	@Override
	public Commande getCommandeById(int id_commande) {
		return commandeDao.findOne(id_commande);
	}

	@Override
	public void calc_montant_total() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MAJ_statut_commande(Commande commande) {
		// TODO Auto-generated method stub
		
	}

}
