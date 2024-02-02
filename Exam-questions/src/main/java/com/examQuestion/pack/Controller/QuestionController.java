package com.examQuestion.pack.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.examQuestion.pack.Model.Question;
import com.examQuestion.pack.Service.QuestionDao;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController

public class QuestionController {
	
	@Autowired
	QuestionDao dao;
	
	@PostMapping("/insert")
	public Question insert (@RequestBody Question question) {
	     return dao.insert(question);
	}
	
	@PostMapping("/insertAll")
	public List<Question> insertAll(@RequestBody List<Question> question){
		return dao.insertAll(question);
	}
	
	@GetMapping("/get/{id}")
	public Question get(@PathVariable int id) {
		return dao.getById(id);
	}
	
	@GetMapping("/getByTestId/{id}")
	public List<Question> getByTestId(@PathVariable int id){
		return dao.getByTestId(id);
	}
	
	@GetMapping("/getAll")
	public List<Question> getAll(){
		return dao.getAll();
	}
	
	@PutMapping("/update")
	public Question update (@RequestBody Question question) {
		return dao.update(question);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return dao.deleteById(id);
	}
	
}
