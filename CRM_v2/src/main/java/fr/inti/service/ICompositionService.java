package fr.inti.service;

import java.util.List;

import fr.inti.model.Composition;

public interface ICompositionService {
	
	public void addComposition(Composition composition);
	public void updateComposition(Composition composition);
	public void deleteComposition(Composition composition);
	public List<Composition> getAllComposition();
	public Composition getCompositionById(int id_composition);
}
