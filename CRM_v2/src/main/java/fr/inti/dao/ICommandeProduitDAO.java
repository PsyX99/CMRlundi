package fr.inti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.CommandeProduit;




@Repository(value = "commande_produitDao")
@Qualifier(value = "commande_produitDao")
@Transactional(readOnly = false)
public interface ICommandeProduitDAO extends CrudRepository<CommandeProduit, Integer> {
	
	@Query(value = "select a from Commande_produit a where a.quantite like %:quantite_commande_produit%")
	public List<CommandeProduit> findByQuantite(@Param("quantite_commande_produit") int quantite);

	@Query(value = "select a from Commande_produit a where a.taux_reduction like %:taxe_reduction_commande_produit%")
	public List<CommandeProduit> findByTaxeReduction(@Param("taxe_reduction_commande_produit") double taux_reduction);
}
