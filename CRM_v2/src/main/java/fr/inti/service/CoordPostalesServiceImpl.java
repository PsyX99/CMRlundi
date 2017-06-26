package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.ICoordPostalesDAO;
import fr.inti.model.CoordPostales;


@Service
public class CoordPostalesServiceImpl implements ICoordPostalesService {

	
	@Autowired
	private ICoordPostalesDAO coord_postalesDao;
	
	public void setCoord_postalesDao(ICoordPostalesDAO coord_postalesDao) {
		this.coord_postalesDao=coord_postalesDao;
	}

	@Override
	public void addCoord_postales(CoordPostales coord_postales) {
		coord_postalesDao.save(coord_postales);
	}

	@Override
	public void updateCoord_postales(CoordPostales coord_postales) {
		coord_postalesDao.save(coord_postales);
	}

	@Override
	public void deleteCoord_postales(CoordPostales coord_postales) {
		coord_postalesDao.delete(coord_postales);
	}

	@Override
	public List<CoordPostales> getAllCoord_postales() {
		return (List<CoordPostales>) coord_postalesDao.findAll();
	}

	@Override
	public CoordPostales getCoord_postalesById(int id_coord_postales) {
		return coord_postalesDao.findOne(id_coord_postales);
	}

	@Override
	public void MAJ_coord_postales() {
		// TODO Auto-generated method stub
		
	}
}
