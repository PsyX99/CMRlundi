package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IHorairesContactDAO;
import fr.inti.model.HorairesContact;


@Service
public class HorairesContactServiceImpl implements IHorairesContactService {

	
	@Autowired
	private IHorairesContactDAO horaires_contactDao;
	
	public void setHoraires_contactDao(IHorairesContactDAO horaires_contactDao) {
		this.horaires_contactDao=horaires_contactDao;
	}

	@Override
	public void addHoraires_contact(HorairesContact horaires_contact) {
		horaires_contactDao.save(horaires_contact);
	}

	@Override
	public void updateHoraires_contact(HorairesContact horaires_contact) {
		horaires_contactDao.save(horaires_contact);
	}

	@Override
	public void deleteHoraires_contact(HorairesContact horaires_contact) {
		horaires_contactDao.delete(horaires_contact);
	}

	@Override
	public List<HorairesContact> getAllHoraires_contact() {
		return (List<HorairesContact>) horaires_contactDao.findAll();
	}

	@Override
	public HorairesContact getHoraires_contactById(int id_horaires_contact) {
		return horaires_contactDao.findOne(id_horaires_contact);
	}

}
