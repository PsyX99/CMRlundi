package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.EquipeCampagne;

@Repository(value = "equipe_campagne")
@Qualifier(value = "equipe_campagne")
@Transactional (readOnly = false)
public interface IEquipeCampagneDAO extends CrudRepository<EquipeCampagne, Integer> {}