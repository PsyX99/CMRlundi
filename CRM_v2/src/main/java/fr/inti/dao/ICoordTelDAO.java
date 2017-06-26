package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.CoordTel;

@Repository(value = "coord_tel")
@Qualifier(value = "coord_tel")
@Transactional (readOnly = false)
public interface ICoordTelDAO extends CrudRepository<CoordTel, Integer> {}



