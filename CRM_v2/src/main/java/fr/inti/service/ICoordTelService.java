package fr.inti.service;

import java.util.List;

import fr.inti.model.CoordTel;

public interface ICoordTelService {
	
	public void addCoord_tel(CoordTel coord_tel);
	public void updateCoord_tel(CoordTel coord_tel);
	public void deleteCoord_tel(CoordTel coord_tel);
	public List<CoordTel> getAllCoord_tel();
	public CoordTel getCoord_telById(int id_coord_tel);
	
	public void MAJ_coord_tel(CoordTel coord_tel);
}
