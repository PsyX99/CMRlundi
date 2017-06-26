package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.HistoTarification;


@Repository(value = "histo_tarificationDao")
@Qualifier(value = "histo_tarificationDao")
@Transactional(readOnly = false)
public interface IHistoTarificationDAO extends CrudRepository<HistoTarification, Integer> {

}
