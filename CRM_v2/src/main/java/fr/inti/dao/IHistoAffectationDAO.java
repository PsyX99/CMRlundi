package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.HistoAffectation;


@Repository(value = "histo_affectationDao")
@Qualifier(value = "histo_affectationDao")
@Transactional(readOnly = false)
public interface IHistoAffectationDAO extends CrudRepository<HistoAffectation, Integer> {

}
