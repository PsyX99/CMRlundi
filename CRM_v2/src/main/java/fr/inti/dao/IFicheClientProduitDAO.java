package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.FicheClientProduit;




@Repository(value = "fiche_client_produitDao")
@Qualifier(value = "fiche_client_produitDao")
@Transactional(readOnly = false)
public interface IFicheClientProduitDAO extends CrudRepository<FicheClientProduit, Integer> {

}
