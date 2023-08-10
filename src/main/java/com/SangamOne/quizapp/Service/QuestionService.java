package com.SangamOne.quizapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SangamOne.quizapp.Dao.QuestionDao;
import com.SangamOne.quizapp.Model.Question;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;
	
	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}

	public List<Question> getQuestionsByCategory(String category) {
		return questionDao.findByCategory(category);
	}
	
}
