package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.HorairesContact;


@Repository(value = "horaires_contactDao")
@Qualifier(value = "horaires_contactDao")
@Transactional(readOnly = false)
public interface IHorairesContactDAO extends CrudRepository<HorairesContact, Integer> {

}
