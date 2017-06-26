package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IEquipeCampagneDAO;
import fr.inti.model.EquipeCampagne;


@Service
public class EquipeCampagneServiceImpl implements IEquipeCampagneService {

	
	@Autowired
	private IEquipeCampagneDAO equipe_campagneDao;
	
	public void setEquipe_campagneDao(IEquipeCampagneDAO equipe_campagneDao) {
		this.equipe_campagneDao=equipe_campagneDao;
	}

	@Override
	public void addEquipe_campagne(EquipeCampagne equipe_campagne) {
		equipe_campagneDao.save(equipe_campagne);
	}

	@Override
	public void updateEquipe_campagne(EquipeCampagne equipe_campagne) {
		equipe_campagneDao.save(equipe_campagne);
	}

	@Override
	public void deleteEquipe_campagne(EquipeCampagne equipe_campagne) {
		equipe_campagneDao.delete(equipe_campagne);
	}

	@Override
	public List<EquipeCampagne> getAllEquipe_campagne() {
		return (List<EquipeCampagne>) equipe_campagneDao.findAll();
	}

	@Override
	public EquipeCampagne getEquipe_campagneById(int id_equipe_campagne) {
		return equipe_campagneDao.findOne(id_equipe_campagne);
	}

}
