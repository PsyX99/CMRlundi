package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Commercial;

@Repository(value = "commercial")
@Qualifier(value = "commercial")
@Transactional (readOnly = false)
public interface ICommercialDAO extends CrudRepository<Commercial, Integer> {}