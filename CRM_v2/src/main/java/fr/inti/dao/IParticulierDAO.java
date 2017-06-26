package fr.inti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Particulier;


@Repository(value = "particulierDao")
@Qualifier(value = "particulierDao")
@Transactional(readOnly = false)
public interface IParticulierDAO extends CrudRepository<Particulier, Integer> {
	
	@Query(value = "select a from Particulier a where a.nom like %:nom_particulier%")
	public List<Particulier> findByNom(@Param("nom_particulier") String nom);
	
	@Query(value="select a from Particulier a where a.age like %:age_particulier%")
	public List<Particulier> findByAge(@Param("age_particulier") int age);
	
	@Query(value="select a from Particulier a where a.situ_familial like %:situ_familiale%")
	public List<Particulier> findBySituation(@Param("situ_familiale") String situ_familial);
	
	@Query(value="select a from Particulier a where a.cat_sociopro like %:cat_socioprof%")
	public List<Particulier> findByCatSocPro(@Param("cat_socioprof") String cat_sociopro);
	
	@Query(value="select a from Particulier a where a.nb_enfants like %:nb_enfant%")
	public List<Particulier> findByNbEnfants(@Param("nb_enfant") int nb_enfants);

	
}
