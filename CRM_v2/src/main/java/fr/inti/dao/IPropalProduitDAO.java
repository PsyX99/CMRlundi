package fr.inti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.PropalProduit;




@Repository(value = "propal_produitDao")
@Qualifier(value = "propal_produitDao")
@Transactional(readOnly = false)
public interface IPropalProduitDAO extends CrudRepository<PropalProduit, Integer>{

	
	@Query(value = "select a from Propal_produit a where a.quantite like %:quantite_propal_produit%")
	public List<PropalProduit> findByQuantite(@Param("quantite_propal_produit") int quantite);

	@Query(value = "select a from Propal_produit a where a.taux_reduction like %:taxe_reduction_propal_produit%")
	public List<PropalProduit> findByTaxeReduction(@Param("taxe_reduction_propal_produit") double taux_reduction);
}
