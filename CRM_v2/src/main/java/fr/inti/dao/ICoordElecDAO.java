package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.CoordElec;

@Repository(value = "coord_elec")
@Qualifier(value = "coord_elec")
@Transactional (readOnly = false)
public interface ICoordElecDAO extends CrudRepository<CoordElec, Integer> {}