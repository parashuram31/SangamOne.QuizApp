package com.SangamOne.quizapp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SangamOne.quizapp.Model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

	List<Question>findByCategory(String category);

}
