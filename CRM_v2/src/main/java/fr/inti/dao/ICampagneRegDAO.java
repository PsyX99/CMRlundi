package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.CampagneReg;

@Repository(value = "campagne_reg")
@Qualifier(value = "campagne_reg")
@Transactional (readOnly = false)
public interface ICampagneRegDAO extends CrudRepository<CampagneReg, Integer> {}