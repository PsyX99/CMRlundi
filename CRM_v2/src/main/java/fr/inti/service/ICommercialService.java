package fr.inti.service;

import java.util.List;

import fr.inti.model.Commercial;

public interface ICommercialService {
	
	public void addCommercial(Commercial commercial);
	public void updateCommercial(Commercial commercial);
	public void deleteCommercial(Commercial commercial);
	public List<Commercial> getAllCommercial();
	public Commercial getCommercialById(int id_commercial);
	
	public void calcul_salaire_final();
}
