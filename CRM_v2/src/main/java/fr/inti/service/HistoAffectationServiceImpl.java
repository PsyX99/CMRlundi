package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IHistoAffectationDAO;
import fr.inti.model.HistoAffectation;


@Service
public class HistoAffectationServiceImpl implements IHistoAffectationService {

	
	@Autowired
	private IHistoAffectationDAO histo_affectationDao;
	
	public void setHisto_affectationDao(IHistoAffectationDAO histo_affectationDao) {
		this.histo_affectationDao=histo_affectationDao;
	}

	@Override
	public void addHisto_affectation(HistoAffectation histo_affectation) {
		histo_affectationDao.save(histo_affectation);
	}

	@Override
	public void updateHisto_affectation(HistoAffectation histo_affectation) {
		histo_affectationDao.save(histo_affectation);
	}

	@Override
	public void deleteHisto_affectation(HistoAffectation histo_affectation) {
		histo_affectationDao.delete(histo_affectation);
	}

	@Override
	public List<HistoAffectation> getAllHisto_affectation() {
		return (List<HistoAffectation>) histo_affectationDao.findAll();
	}

	@Override
	public HistoAffectation getHisto_affectationById(int id_histo_affectation) {
		return histo_affectationDao.findOne(id_histo_affectation);
	}

	@Override
	public void MAJ_num_ordre() {
		// TODO Auto-generated method stub
		
	}

}
