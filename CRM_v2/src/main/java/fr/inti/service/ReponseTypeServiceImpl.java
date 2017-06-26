package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IReponseTypeDAO;
import fr.inti.model.ReponseType;


@Service
public class ReponseTypeServiceImpl implements IReponseTypeService {

	
	@Autowired
	private IReponseTypeDAO reponse_typeDao;
	
	public void setReponse_typeDao(IReponseTypeDAO reponse_typeDao) {
		this.reponse_typeDao=reponse_typeDao;
	}

	@Override
	public void addReponse_type(ReponseType reponse_type) {
		reponse_typeDao.save(reponse_type);
	}

	@Override
	public void updateReponse_type(ReponseType reponse_type) {
		reponse_typeDao.save(reponse_type);
	}

	@Override
	public void deleteReponse_type(ReponseType reponse_type) {
		reponse_typeDao.delete(reponse_type);
	}

	@Override
	public List<ReponseType> getAllReponse_type() {
		return (List<ReponseType>) reponse_typeDao.findAll();
	}

	@Override
	public ReponseType getReponse_typeById(int id_reponse_type) {
		return reponse_typeDao.findOne(id_reponse_type);
	}
}
