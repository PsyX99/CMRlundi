package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IEquipeComDAO;
import fr.inti.model.EquipeCom;
import fr.inti.model.RespCommercial;


@Service
public class EquipeComServiceImpl implements IEquipeComService {

	
	@Autowired
	private IEquipeComDAO equipe_comDao;
	
	public void setEquipe_comDao(IEquipeComDAO equipe_comDao) {
		this.equipe_comDao=equipe_comDao;
	}

	@Override
	public void addEquipe_com(EquipeCom equipe_com) {
		equipe_comDao.save(equipe_com);
	}

	@Override
	public void updateEquipe_com(EquipeCom equipe_com) {
		equipe_comDao.save(equipe_com);
	}

	@Override
	public void deleteEquipe_com(EquipeCom equipe_com) {
		equipe_comDao.delete(equipe_com);
	}

	@Override
	public List<EquipeCom> getAllEquipe_com() {
		return (List<EquipeCom>) equipe_comDao.findAll();
	}

	@Override
	public EquipeCom getEquipe_comById(int id_equipe_com) {
		return equipe_comDao.findOne(id_equipe_com);
	}

	@Override
	public void definir_equipe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RespCommercial attribuer_responsable(EquipeCom equipe_com) {
		// TODO Auto-generated method stub
		return null;
	}

}
