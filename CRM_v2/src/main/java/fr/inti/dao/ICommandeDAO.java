package fr.inti.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Commande;

@Repository(value = "commandeDao")
@Qualifier(value = "commandeDao")
@Transactional(readOnly = false)
public interface ICommandeDAO extends CrudRepository<Commande, Integer> {

	@Query(value = "select a from Commande a where a.num_commande like %:num_commande_commande%")
	public List<Commande> findByNumCommande(
			@Param("num_commande") int num_commande);

	@Query(value = "select a from Commande a where a.date_commande like %:date_commande%")
	public List<Commande> findByDate(@Param("date") Date date);

	@Query(value = "select a from Commande a where a.date_livraison_commande like %:date_livraison_commande%")
	public List<Commande> findByDateLivraison(
			@Param("date_livraison") Date date_livraison);

	@Query(value = "select a from Commande a where a.conditions_livraison_commande like %:conditions_livraison_commande%")
	public List<Commande> findByConditionsLivraison(
			@Param("conditions_livraison") String conditions_livraison);

	@Query(value = "select a from Commande a where a.modalites_paiement_commande like %:modalites_paiement_commande%")
	public List<Commande> findByModalitesPaiement(
			@Param("modalites_paiement") String modalites_paiement);

	@Query(value = "select a from Commande a where a.statut like %:statut_commande%")
	public List<Commande> findBySatut(@Param("statut") String statut);

}
