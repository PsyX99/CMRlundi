package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IContactDAO;
import fr.inti.model.Client;
import fr.inti.model.Contact;


@Service
public class ContactServiceImpl implements IContactService {

	
	@Autowired
	private IContactDAO contactDao;
	
	public void setContactDao(IContactDAO contactDao) {
		this.contactDao=contactDao;
	}

	@Override
	public void addContact(Contact contact) {
		contactDao.save(contact);
	}

	@Override
	public void updateContact(Contact contact) {
		contactDao.save(contact);
	}

	@Override
	public void deleteContact(Contact contact) {
		contactDao.delete(contact);
	}

	@Override
	public List<Contact> getAllContact() {
		return (List<Contact>) contactDao.findAll();
	}

	@Override
	public Contact getContactById(int id_contact) {
		return contactDao.findOne(id_contact);
	}

	@Override
	public Client recup_client() {
		// TODO Auto-generated method stub
		return null;
	}

}
