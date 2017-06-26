package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.ICoordTelDAO;
import fr.inti.model.CoordTel;


@Service
public class CoordTelServiceImpl implements ICoordTelService {

	
	@Autowired
	private ICoordTelDAO coord_telDao;
	
	public void setCoord_telDao(ICoordTelDAO coord_telDao) {
		this.coord_telDao=coord_telDao;
	}

	@Override
	public void addCoord_tel(CoordTel coord_tel) {
		coord_telDao.save(coord_tel);
	}

	@Override
	public void updateCoord_tel(CoordTel coord_tel) {
		coord_telDao.save(coord_tel);
	}

	@Override
	public void deleteCoord_tel(CoordTel coord_tel) {
		coord_telDao.delete(coord_tel);
	}

	@Override
	public List<CoordTel> getAllCoord_tel() {
		return (List<CoordTel>) coord_telDao.findAll();
	}

	@Override
	public CoordTel getCoord_telById(int id_coord_tel) {
		return coord_telDao.findOne(id_coord_tel);
	}

	@Override
	public void MAJ_coord_tel(CoordTel coord_tel) {
		// TODO Auto-generated method stub
		
	}
}
