package com.SangamOne.quizapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SangamOne.quizapp.Model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {


}
