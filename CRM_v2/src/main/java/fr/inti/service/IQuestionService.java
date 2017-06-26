package fr.inti.service;

import java.util.List;

import fr.inti.model.Question;

public interface IQuestionService {
	
	public void addQuestion(Question question);
	public void updateQuestion(Question question);
	public void deleteQuestion(Question question);
	public List<Question> getAllQuestion();
	public Question getQuestionById(int id_question);
}
