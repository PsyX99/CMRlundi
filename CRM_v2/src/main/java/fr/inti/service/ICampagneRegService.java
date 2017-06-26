package fr.inti.service;

import java.util.List;

import fr.inti.model.CampagneReg;

public interface ICampagneRegService {
	
	public void addCampagne_reg(CampagneReg campagne_reg);
	public void updateCampagne_reg(CampagneReg campagne_reg);
	public void deleteCampagne_reg(CampagneReg campagne_reg);
	public List<CampagneReg> getAllCampagne_reg();
	public CampagneReg getCampagne_regById(int id_campagne_reg);
	
	public void planifier_campagne();
	public void choisir_forme_annonce();
}
