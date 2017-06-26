package fr.inti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.CoordPostales;


@Repository(value = "coord_postalesDao")
@Qualifier(value = "coord_postalesDao")
@Transactional(readOnly = false)
public interface ICoordPostalesDAO extends CrudRepository<CoordPostales, Integer> {

	
	@Query(value = "select a from Coord_postales a where a.numero like %:numero_coord_postales%")
	public List<CoordPostales> findByNumero(@Param("numero_coord_postales") int numero);
	
	@Query(value = "select a from Coord_postales a where a.rue like %:rue_coord_postales%")
	public List<CoordPostales> findByRue(@Param("rue_coord_postales") String rue);
	
	@Query(value = "select a from Coord_postales a where a.code_postal like %:code_postal_coord_postales%")
	public List<CoordPostales> findByCodePostal(@Param("code_postal_coord_postales") int code_postal);
	
	@Query(value = "select a from Coord_postales a where a.ville like %:ville_coord_postales%")
	public List<CoordPostales> findByVille(@Param("ville_coord_postales") String ville);
	



}
