package fr.inti.service;

import java.util.List;

import fr.inti.model.Particulier;

public interface IParticulierService {
	
	public void addParticulier(Particulier particulier);
	public void updateParticulier(Particulier particulier);
	public void deleteParticulier(Particulier particulier);
	public List<Particulier> getAllParticulier();
	
	public Particulier findParticulierById(int id);
	public List<Particulier> findParticulierByNom(String nom);
	public List<Particulier> findParticulierByAge(int age);
	public List<Particulier> findParticulierByNbEnfants(int nbenfants);
	public List<Particulier> findParticulierByCatSocioPro(String cat);
	public List<Particulier> findParticulierBySituation(String situation);

}
