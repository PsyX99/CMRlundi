package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IFactureDAO;
import fr.inti.model.Facture;


@Service
public class FactureServiceImpl implements IFactureService {

	
	@Autowired
	private IFactureDAO factureDao;
	
	public void setFactureDao(IFactureDAO factureDao) {
		this.factureDao=factureDao;
	}

	@Override
	public void addFacture(Facture facture) {
		factureDao.save(facture);
	}

	@Override
	public void updateFacture(Facture facture) {
		factureDao.save(facture);
	}

	@Override
	public void deleteFacture(Facture facture) {
		factureDao.delete(facture);
	}

	@Override
	public List<Facture> getAllFacture() {
		return (List<Facture>) factureDao.findAll();
	}

	@Override
	public Facture getFactureById(int id_facture) {
		return factureDao.findOne(id_facture);
	}

	@Override
	public void affecter_reglement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MAJ_nb_relances() {
		// TODO Auto-generated method stub
		
	}

}
