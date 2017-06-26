package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Produit;


@Repository(value = "produitDao")
@Qualifier(value = "produitDao")
@Transactional(readOnly = false)
public interface IProduitDAO extends CrudRepository<Produit, Integer> {

}
