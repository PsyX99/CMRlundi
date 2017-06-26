package fr.inti.service;

import java.util.List;

import fr.inti.model.CoordPostales;

public interface ICoordPostalesService {
	
	public void addCoord_postales(CoordPostales coord_postales);
	public void updateCoord_postales(CoordPostales coord_postales);
	public void deleteCoord_postales(CoordPostales coord_postales);
	public List<CoordPostales> getAllCoord_postales();
	public CoordPostales getCoord_postalesById(int id_coord_postales);
	
	public void MAJ_coord_postales();
}
