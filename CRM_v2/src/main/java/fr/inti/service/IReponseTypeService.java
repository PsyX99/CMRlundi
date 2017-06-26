package fr.inti.service;

import java.util.List;

import fr.inti.model.ReponseType;

public interface IReponseTypeService {
	
	public void addReponse_type(ReponseType reponse_type);
	public void updateReponse_type(ReponseType reponse_type);
	public void deleteReponse_type(ReponseType reponse_type);
	public List<ReponseType> getAllReponse_type();
	public ReponseType getReponse_typeById(int id_reponse_type);
}
