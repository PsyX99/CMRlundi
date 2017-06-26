package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.ICompositionDAO;
import fr.inti.model.Composition;


@Service
public class CompositionServiceImpl implements ICompositionService {

	
	@Autowired
	private ICompositionDAO compositionDao;
	
	public void setCompositionDao(ICompositionDAO compositionDao) {
		this.compositionDao=compositionDao;
	}

	@Override
	public void addComposition(Composition composition) {
		compositionDao.save(composition);
	}

	@Override
	public void updateComposition(Composition composition) {
		compositionDao.save(composition);
	}

	@Override
	public void deleteComposition(Composition composition) {
		compositionDao.delete(composition);
	}

	@Override
	public List<Composition> getAllComposition() {
		return (List<Composition>) compositionDao.findAll();
	}

	@Override
	public Composition getCompositionById(int id_composition) {
		return compositionDao.findOne(id_composition);
	}

}
