package fr.inti.service;

import java.util.List;

import fr.inti.model.CoordElec;

public interface ICoordElecService {
	
	public void addCoord_elec(CoordElec coord_elec);
	public void updateCoord_elec(CoordElec coord_elec);
	public void deleteCoord_elec(CoordElec coord_elec);
	public List<CoordElec> getAllCoord_elec();
	public CoordElec getCoord_elecById(int id_coord_elec);
	
	public void MAJ_Coord_elec(CoordElec coord_elec);
}
