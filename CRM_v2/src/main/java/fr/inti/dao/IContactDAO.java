package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Contact;

@Repository(value = "contact")
@Qualifier(value = "contact")
@Transactional (readOnly = false)
public interface IContactDAO extends CrudRepository<Contact, Integer> {}