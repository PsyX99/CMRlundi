package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.EquipeCom;


@Repository(value = "equipe_comDao")
@Qualifier(value = "equipe_comDao")
@Transactional(readOnly = false)
public interface IEquipeComDAO extends CrudRepository<EquipeCom, Integer> {

}
