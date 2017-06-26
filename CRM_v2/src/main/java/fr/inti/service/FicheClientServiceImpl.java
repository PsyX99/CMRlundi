package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IFicheClientDAO;
import fr.inti.model.FicheClient;


@Service
public class FicheClientServiceImpl implements IFicheClientService {

	
	@Autowired
	private IFicheClientDAO fiche_clientDao;
	
	public void setFiche_clientDao(IFicheClientDAO fiche_clientDao) {
		this.fiche_clientDao=fiche_clientDao;
	}

	@Override
	public void addFiche_client(FicheClient fiche_client) {
		fiche_clientDao.save(fiche_client);
	}

	@Override
	public void updateFiche_client(FicheClient fiche_client) {
		fiche_clientDao.save(fiche_client);
	}

	@Override
	public void deleteFiche_client(FicheClient fiche_client) {
		fiche_clientDao.delete(fiche_client);
	}

	@Override
	public List<FicheClient> getAllFiche_client() {
		return (List<FicheClient>) fiche_clientDao.findAll();
	}

	@Override
	public FicheClient getFiche_clientById(int id_fiche_client) {
		return fiche_clientDao.findOne(id_fiche_client);
	}

}
