package fr.inti.service;

import java.util.List;

import fr.inti.model.Question;
import fr.inti.model.Questionnaire;

public interface IQuestionnaireService {
	
	public void addQuestionnaire(Questionnaire questionnaire);
	public void updateQuestionnaire(Questionnaire questionnaire);
	public void deleteQuestionnaire(Questionnaire questionnaire);
	public List<Questionnaire> getAllQuestionnaire();
	public Questionnaire getQuestionnaireById(int id_questionnaire);
	
	public void planifier_campagne();
	public void choisir_forme_annonce();
	public void attribuer_type();
	public List<Question> ajouter_question(Questionnaire questionnaire);
}
