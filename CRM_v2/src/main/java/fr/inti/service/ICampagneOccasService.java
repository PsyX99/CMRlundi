package fr.inti.service;

import java.util.List;

import fr.inti.model.CampagneOccas;

public interface ICampagneOccasService{
	
	public void addCampagne_occas(CampagneOccas campagne_occas);
	public void updateCampagne_occas(CampagneOccas campagne_occas);
	public void deleteCampagne_occas(CampagneOccas campagne_occas);
	public List<CampagneOccas> getAllCampagne_occas();
	public CampagneOccas getCampagne_occasById(int id_campagne_occas);
	
	public void planifier_campagne();
	public void choisir_forme_annonce();
}
