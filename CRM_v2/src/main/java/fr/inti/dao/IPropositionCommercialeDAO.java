package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Proposition_commerciale;


@Repository(value = "proposition_commercialeDao")
@Qualifier(value = "proposition_commercialeDao")
@Transactional(readOnly = false)
public interface IPropositionCommercialeDAO extends CrudRepository<Proposition_commerciale, Integer> {

}
