package com.SangamOne.quizapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.quizapp.Model.Question;
import com.SangamOne.quizapp.Service.QuestionService;

@RestController
@RequestMapping(value="/question")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;

	@GetMapping("/allQuestions")
	public List<Question> getAllQuestions() {
		return questionService.getAllQuestions();
	}
	
	@GetMapping(value="/category/{category}")
	public List<Question>getQuestionsByCategory(@PathVariable String category){
		return questionService.getQuestionsByCategory(category);
	}
}
