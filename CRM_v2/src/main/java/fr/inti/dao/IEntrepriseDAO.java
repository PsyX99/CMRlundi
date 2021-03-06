package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Entreprise;

@Repository(value = "entreprise")
@Qualifier(value = "entreprise")
@Transactional (readOnly = false)
public interface IEntrepriseDAO extends CrudRepository<Entreprise, Integer> {}


	    