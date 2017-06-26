package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IQuestionDAO;
import fr.inti.model.Question;


@Service
public class QuestionServiceImpl implements IQuestionService {

	
	@Autowired
	private IQuestionDAO questionDao;
	
	public void setQuestionDao(IQuestionDAO questionDao) {
		this.questionDao=questionDao;
	}

	@Override
	public void addQuestion(Question question) {
		questionDao.save(question);
	}

	@Override
	public void updateQuestion(Question question) {
		questionDao.save(question);
	}

	@Override
	public void deleteQuestion(Question question) {
		questionDao.delete(question);
	}

	@Override
	public List<Question> getAllQuestion() {
		return (List<Question>) questionDao.findAll();
	}

	@Override
	public Question getQuestionById(int id_question) {
		return questionDao.findOne(id_question);
	}
}
