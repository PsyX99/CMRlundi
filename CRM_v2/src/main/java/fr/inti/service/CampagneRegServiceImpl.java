package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.ICampagneRegDAO;
import fr.inti.model.CampagneReg;


@Service
public class CampagneRegServiceImpl implements ICampagneRegService {

	
	@Autowired
	private ICampagneRegDAO campagne_regDao;
	
	public void setCampagne_regDao(ICampagneRegDAO campagne_regDao) {
		this.campagne_regDao=campagne_regDao;
	}

	@Override
	public void addCampagne_reg(CampagneReg campagne_reg) {
		campagne_regDao.save(campagne_reg);
	}

	@Override
	public void updateCampagne_reg(CampagneReg campagne_reg) {
		campagne_regDao.save(campagne_reg);
	}

	@Override
	public void deleteCampagne_reg(CampagneReg campagne_reg) {
		campagne_regDao.delete(campagne_reg);
	}

	@Override
	public List<CampagneReg> getAllCampagne_reg() {
		return (List<CampagneReg>) campagne_regDao.findAll();
	}

	@Override
	public CampagneReg getCampagne_regById(int id_campagne_reg) {
		return campagne_regDao.findOne(id_campagne_reg);
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
