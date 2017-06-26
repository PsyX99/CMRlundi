package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IQuestionnaireDAO;
import fr.inti.model.Question;
import fr.inti.model.Questionnaire;


@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {

	
	@Autowired
	private IQuestionnaireDAO questionnaireDao;
	
	public void setQuestionnaireDao(IQuestionnaireDAO questionnaireDao) {
		this.questionnaireDao=questionnaireDao;
	}

	@Override
	public void addQuestionnaire(Questionnaire questionnaire) {
		questionnaireDao.save(questionnaire);
	}

	@Override
	public void updateQuestionnaire(Questionnaire questionnaire) {
		questionnaireDao.save(questionnaire);
	}

	@Override
	public void deleteQuestionnaire(Questionnaire questionnaire) {
		questionnaireDao.delete(questionnaire);
	}

	@Override
	public List<Questionnaire> getAllQuestionnaire() {
		return (List<Questionnaire>) questionnaireDao.findAll();
	}

	@Override
	public Questionnaire getQuestionnaireById(int id_questionnaire) {
		return questionnaireDao.findOne(id_questionnaire);
	}

	@Override
	public void attribuer_type() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Question> ajouter_question(Questionnaire questionnaire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void planifier_campagne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choisir_forme_annonce() {
		// TODO Auto-generated method stub
		
	}


	
}
