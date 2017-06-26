package fr.inti.service;

import java.util.List;

import fr.inti.model.HistoAffectation;

public interface IHistoAffectationService {
	
	public void addHisto_affectation(HistoAffectation histo_affectation);
	public void updateHisto_affectation(HistoAffectation histo_affectation);
	public void deleteHisto_affectation(HistoAffectation histo_affectation);
	public List<HistoAffectation> getAllHisto_affectation();
	public HistoAffectation getHisto_affectationById(int id_histo_affectation);
	
	public void MAJ_num_ordre();
}
