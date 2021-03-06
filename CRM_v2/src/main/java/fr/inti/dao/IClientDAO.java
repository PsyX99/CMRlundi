package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Client;

@Repository(value = "client")
@Qualifier(value = "client")
@Transactional (readOnly = false)
public interface IClientDAO extends CrudRepository<Client, Integer> {


	    
	}