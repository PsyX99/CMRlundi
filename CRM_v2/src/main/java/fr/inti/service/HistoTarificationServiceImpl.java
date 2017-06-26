package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IHistoTarificationDAO;
import fr.inti.model.HistoTarification;


@Service
public class HistoTarificationServiceImpl implements IHistoTarificationService {

	
	@Autowired
	private IHistoTarificationDAO histo_tarificationDao;
	
	public void setHisto_tarificationDao(IHistoTarificationDAO histo_tarificationDao) {
		this.histo_tarificationDao=histo_tarificationDao;
	}

	@Override
	public void addHisto_tarification(HistoTarification histo_tarification) {
		histo_tarificationDao.save(histo_tarification);
	}

	@Override
	public void updateHisto_tarification(HistoTarification histo_tarification) {
		histo_tarificationDao.save(histo_tarification);
	}

	@Override
	public void deleteHisto_tarification(HistoTarification histo_tarification) {
		histo_tarificationDao.delete(histo_tarification);
	}

	@Override
	public List<HistoTarification> getAllHisto_tarification() {
		return (List<HistoTarification>) histo_tarificationDao.findAll();
	}

	@Override
	public HistoTarification getHisto_tarificationById(int id_histo_tarification) {
		return histo_tarificationDao.findOne(id_histo_tarification);
	}

	@Override
	public void MAJ_tarification() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calc_prix_base() {
		// TODO Auto-generated method stub
		
	}

}
