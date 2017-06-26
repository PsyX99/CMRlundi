package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.ICoordElecDAO;
import fr.inti.model.CoordElec;


@Service
public class CoordElecServiceImpl implements ICoordElecService {

	
	@Autowired
	private ICoordElecDAO coord_elecDao;
	
	public void setCoord_elecDao(ICoordElecDAO coord_elecDao) {
		this.coord_elecDao=coord_elecDao;
	}

	@Override
	public void addCoord_elec(CoordElec coord_elec) {
		coord_elecDao.save(coord_elec);
	}

	@Override
	public void updateCoord_elec(CoordElec coord_elec) {
		coord_elecDao.save(coord_elec);
	}

	@Override
	public void deleteCoord_elec(CoordElec coord_elec) {
		coord_elecDao.delete(coord_elec);
	}

	@Override
	public List<CoordElec> getAllCoord_elec() {
		return (List<CoordElec>) coord_elecDao.findAll();
	}

	@Override
	public CoordElec getCoord_elecById(int id_coord_elec) {
		return coord_elecDao.findOne(id_coord_elec);
	}

	@Override
	public void MAJ_Coord_elec(CoordElec coord_elec) {
		// TODO Auto-generated method stub
		
	}
}
