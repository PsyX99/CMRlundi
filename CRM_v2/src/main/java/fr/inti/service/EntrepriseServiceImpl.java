package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IEntrepriseDAO;
import fr.inti.model.Entreprise;


@Service
public class EntrepriseServiceImpl implements IEntrepriseService {

	
	@Autowired
	private IEntrepriseDAO entrepriseDao;
	
	public void setEntrepriseDao(IEntrepriseDAO entrepriseDao) {
		this.entrepriseDao=entrepriseDao;
	}

	@Override
	public void addEntreprise(Entreprise entreprise) {
		entrepriseDao.save(entreprise);
	}

	@Override
	public void updateEntreprise(Entreprise entreprise) {
		entrepriseDao.save(entreprise);
	}

	@Override
	public void deleteEntreprise(Entreprise entreprise) {
		entrepriseDao.delete(entreprise);
	}

	@Override
	public List<Entreprise> getAllEntreprise() {
		return (List<Entreprise>) entrepriseDao.findAll();
	}

	@Override
	public Entreprise getEntrepriseById(int id_entreprise) {
		return entrepriseDao.findOne(id_entreprise);
	}

	@Override
	public void MAJ_famille_client() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MAJ_niveau_client() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choisir_moyen_com() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void relancer_client() {
		// TODO Auto-generated method stub
		
	}
}
