package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.FicheClient;


@Repository(value = "fiche_clientDao")
@Qualifier(value = "fiche_clientDao")
@Transactional(readOnly = false)
public interface IFicheClientDAO extends CrudRepository<FicheClient, Integer> {

}
