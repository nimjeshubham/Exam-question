package com.examQuestion.pack.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examQuestion.pack.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer>{
	
	List<Question> findByTestId(int testId);

}
