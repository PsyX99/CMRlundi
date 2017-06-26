package fr.inti.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.inti.dao.IParticulierDAO;
import fr.inti.model.Particulier;

@Service(value="particulierService")
@Qualifier(value="particulierService")
public class ParticulierServiceImpl implements IParticulierService {

	@Autowired(required=true)
	@Resource(name="particulierDao")
	private IParticulierDAO pDAO;
	
	public IParticulierDAO getpDAO() {
		return pDAO;
	}

	public void setpDAO(IParticulierDAO pDAO) {
		this.pDAO = pDAO;
	}

	public void addParticulier(Particulier particulier) {
		
		pDAO.save(particulier);
		
	}

	public void updateParticulier(Particulier particulier) {

		pDAO.save(particulier);
		
	}

	public void deleteParticulier(Particulier particulier) {

		pDAO.delete(particulier);
		
	}

	public Particulier findParticulierById(int id) {

		Particulier particulier = pDAO.findOne(id);
		return particulier;
	}

	public List<Particulier> findParticulierByNom(String nom) {
		
		List<Particulier> particuliers = pDAO.findByNom(nom);
		return particuliers;
	}

	public List<Particulier> findParticulierByAge(int age) {
		// TODO Auto-generated method stub
		List<Particulier> particuliers = pDAO.findByAge(age);
		return particuliers;
	}

	public List<Particulier> findParticulierByNbEnfants(int nbenfants) {
		// TODO Auto-generated method stub
		List<Particulier> particuliers = pDAO.findByNbEnfants(nbenfants);
		return particuliers;
	}

	public List<Particulier> findParticulierByCatSocioPro(String cat) {
		// TODO Auto-generated method stub
		List<Particulier> particuliers = pDAO.findByCatSocPro(cat);
		return particuliers;
	}

	public List<Particulier> findParticulierBySituation(String situation) {
		// TODO Auto-generated method stub
		List<Particulier> particuliers = pDAO.findBySituation(situation);
		return particuliers;
	}

	public List<Particulier> getAllParticulier() {
		// TODO Auto-generated method stub
		List<Particulier> particuliers = (List<Particulier>)pDAO.findAll();
		return particuliers;
	}
	
	

}

