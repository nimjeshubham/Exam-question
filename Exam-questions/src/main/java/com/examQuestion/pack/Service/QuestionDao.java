package com.examQuestion.pack.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examQuestion.pack.Model.Question;
import com.examQuestion.pack.Repository.QuestionRepo;

@Service
public class QuestionDao {
	
	@Autowired
	QuestionRepo repo;
	
	public Question insert(Question q) {
		return repo.save(q);
	}
	
	public Question getById(Integer Id) {
		return repo.findById(Id).orElse(null);
	}
	
	public List<Question> getAll(){
		return repo.findAll();
	} 
	
	public List<Question> getByTestId(Integer id){
		return repo.findByTestId(id);
	}
	
	public Question update (Question q) {
		Question qq =repo.findById(q.getQuestionId()).orElse(null);
		qq.setQuestion(q.getQuestion());
		qq.setOptionA(q.getOptionA());
		qq.setOptionB(q.getOptionB());
		qq.setOptionC(q.getOptionC());
		qq.setOptionD(q.getOptionD());
		qq.setAnswer(q.getAnswer());
		qq.setTestId(q.getTestId());
		return repo.save(qq);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

}
