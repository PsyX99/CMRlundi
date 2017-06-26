package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.ReponseType;

@Repository(value = "reponse_type")
@Qualifier(value = "reponse_type")
@Transactional (readOnly = false)
public interface IReponseTypeDAO extends CrudRepository<ReponseType, Integer> {}