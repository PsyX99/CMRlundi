package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.ICampagneOccasDAO;
import fr.inti.model.CampagneOccas;


@Service
public class CampagneOccasServiceImpl implements ICampagneOccasService {

	
	@Autowired
	private ICampagneOccasDAO campagne_occasDao;
	
	public void setCampagne_occasDao(ICampagneOccasDAO campagne_occasDao) {
		this.campagne_occasDao=campagne_occasDao;
	}

	@Override
	public void addCampagne_occas(CampagneOccas campagne_occas) {
		campagne_occasDao.save(campagne_occas);
	}

	@Override
	public void updateCampagne_occas(CampagneOccas campagne_occas) {
		campagne_occasDao.save(campagne_occas);
	}

	@Override
	public void deleteCampagne_occas(CampagneOccas campagne_occas) {
		campagne_occasDao.delete(campagne_occas);
	}

	@Override
	public List<CampagneOccas> getAllCampagne_occas() {
		return (List<CampagneOccas>) campagne_occasDao.findAll();
	}

	@Override
	public CampagneOccas getCampagne_occasById(int id_campagne_occas) {
		return campagne_occasDao.findOne(id_campagne_occas);
	}

	@Override
	public void planifier_campagne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choisir_forme_annonce() {
		// TODO Auto-generated method stub
		
	}


}
