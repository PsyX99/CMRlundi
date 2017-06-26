package fr.inti.service;

import java.util.List;

import fr.inti.model.HistoTarification;

public interface IHistoTarificationService {
	
	public void addHisto_tarification(HistoTarification histo_tarification);
	public void updateHisto_tarification(HistoTarification histo_tarification);
	public void deleteHisto_tarification(HistoTarification histo_tarification);
	public List<HistoTarification> getAllHisto_tarification();
	public HistoTarification getHisto_tarificationById(int id_histo_tarification);
	
	public void MAJ_tarification();
	public void calc_prix_base();
}
