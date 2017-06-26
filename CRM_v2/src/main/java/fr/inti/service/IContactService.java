package fr.inti.service;

import java.util.List;

import fr.inti.model.Client;
import fr.inti.model.Contact;

public interface IContactService {
	
	public void addContact(Contact contact);
	public void updateContact(Contact contact);
	public void deleteContact(Contact contact);
	public List<Contact> getAllContact();
	public Contact getContactById(int id_contact);
	
	public Client recup_client();
}
