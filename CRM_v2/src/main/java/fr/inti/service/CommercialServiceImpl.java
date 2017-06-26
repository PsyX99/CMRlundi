package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.ICommercialDAO;
import fr.inti.model.Commercial;


@Service
public class CommercialServiceImpl implements ICommercialService {

	
	@Autowired
	private ICommercialDAO commercialDao;
	
	public void setCommercialDao(ICommercialDAO commercialDao) {
		this.commercialDao=commercialDao;
	}

	@Override
	public void addCommercial(Commercial commercial) {
		commercialDao.save(commercial);
	}

	@Override
	public void updateCommercial(Commercial commercial) {
		commercialDao.save(commercial);
	}

	@Override
	public void deleteCommercial(Commercial commercial) {
		commercialDao.delete(commercial);
	}

	@Override
	public List<Commercial> getAllCommercial() {
		return (List<Commercial>) commercialDao.findAll();
	}

	@Override
	public Commercial getCommercialById(int id_commercial) {
		return commercialDao.findOne(id_commercial);
	}

	@Override
	public void calcul_salaire_final() {
		// TODO Auto-generated method stub
		
	}

}
