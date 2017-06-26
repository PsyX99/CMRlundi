package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IPropositionCommercialeDAO;
import fr.inti.model.Proposition_commerciale;


@Service
public class PropositionCommercialeServiceImpl implements IPropositionCommercialeService {

	
	@Autowired
	private IPropositionCommercialeDAO proposition_commercialeDao;
	
	public void setProposition_commercialeDao(IPropositionCommercialeDAO proposition_commercialeDao) {
		this.proposition_commercialeDao=proposition_commercialeDao;
	}

	@Override
	public void addProposition_commerciale(Proposition_commerciale proposition_commerciale) {
		proposition_commercialeDao.save(proposition_commerciale);
	}

	@Override
	public void updateProposition_commerciale(Proposition_commerciale proposition_commerciale) {
		proposition_commercialeDao.save(proposition_commerciale);
	}

	@Override
	public void deleteProposition_commerciale(Proposition_commerciale proposition_commerciale) {
		proposition_commercialeDao.delete(proposition_commerciale);
	}

	@Override
	public List<Proposition_commerciale> getAllProposition_commerciale() {
		return (List<Proposition_commerciale>) proposition_commercialeDao.findAll();
	}

	@Override
	public Proposition_commerciale getProposition_commercialeById(int id_proposition_commerciale) {
		return proposition_commercialeDao.findOne(id_proposition_commerciale);
	}

	@Override
	public void calcul_montant_total() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MAJ_status_propal(
			Proposition_commerciale proposition_commerciale) {
		// TODO Auto-generated method stub
		
	}
}
