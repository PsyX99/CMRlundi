package fr.inti.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.model.Questionnaire;

@Repository(value = "questionnaire")
@Qualifier(value = "questionnaire")
@Transactional (readOnly = false)
public interface IQuestionnaireDAO extends CrudRepository<Questionnaire, Integer> {}