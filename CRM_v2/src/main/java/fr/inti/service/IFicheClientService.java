package fr.inti.service;

import java.util.List;

import fr.inti.model.FicheClient;

public interface IFicheClientService {
	
	public void addFiche_client(FicheClient fiche_client);
	public void updateFiche_client(FicheClient fiche_client);
	public void deleteFiche_client(FicheClient fiche_client);
	public List<FicheClient> getAllFiche_client();
	public FicheClient getFiche_clientById(int id_fiche_client);
}
