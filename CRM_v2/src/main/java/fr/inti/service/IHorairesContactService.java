package fr.inti.service;

import java.util.List;

import fr.inti.model.HorairesContact;

public interface IHorairesContactService {
	
	public void addHoraires_contact(HorairesContact horaires_contact);
	public void updateHoraires_contact(HorairesContact horaires_contact);
	public void deleteHoraires_contact(HorairesContact horaires_contact);
	public List<HorairesContact> getAllHoraires_contact();
	public HorairesContact getHoraires_contactById(int id_horaires_contact);
}
