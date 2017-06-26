package fr.inti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Composition;



@Repository(value = "compositionDao")
@Qualifier(value = "compositionDao")
@Transactional(readOnly = false)
public interface ICompositionDAO extends CrudRepository<Composition, Integer> {

	
	@Query(value = "select a from Composition a where a.quantite like %:quantite_composition%")
	public List<Composition> findByQuantite(@Param("quantite_composition") int quantite);
}
