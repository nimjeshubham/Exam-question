package com.examQuestion.pack.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examQuestion.pack.Model.Question;
import com.examQuestion.pack.Service.QuestionDao;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class QuestionController {
	@Autowired
	QuestionDao dao;
	
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(HttpServletRequest req, HttpServletResponse res) {
    ModelAndView mv = new ModelAndView();
    String admin= req.getParameter("adminID");
    String password= req.getParameter("pass");
	try {
		if(admin.contentEquals("admin") && password.contentEquals("123456")) {
			mv.setViewName("operations");
		}
		else {
			mv.setViewName("somethingWrongEnter1");
		}
		
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter1");
		}
		return mv;
	}
	
	@RequestMapping("/registerQuestion")
	public ModelAndView registerQuestion(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Question question = new Question();
			question.setTestId(Integer.parseInt( req.getParameter("test")));
			question.setQuestion(req.getParameter("question"));
			question.setOptionA(req.getParameter("a"));
			question.setOptionB(req.getParameter("b"));
			question.setOptionC(req.getParameter("c"));
			question.setOptionD(req.getParameter("d"));
			question.setAnswer(req.getParameter("answer"));
		    
		    dao.insert(question);
		    mv.setViewName("showTest");
		    mv.addObject("question", question);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
		
		
		
		
	}
	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if (dao.getById(Integer.parseInt( req.getParameter("qId"))) != null) {
				Question question = dao.getById(Integer.parseInt( req.getParameter("qId")));
				question.setTestId(Integer.parseInt( req.getParameter("test")));
				question.setQuestion(req.getParameter("question"));
				question.setOptionA(req.getParameter("a"));
				question.setOptionB(req.getParameter("b"));
				question.setOptionC(req.getParameter("c"));
				question.setOptionD(req.getParameter("d"));
				question.setAnswer(req.getParameter("answer"));
			    
			    dao.update(question);
			    mv.setViewName("showTest");
			    mv.addObject("question", question);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		dao.deleteById(Integer.parseInt( req.getParameter("qId")));
		mv.setViewName("operations");
		return mv;
		}
	
	@RequestMapping("/getIndi")
	public ModelAndView getIndi(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if (dao.getById(Integer.parseInt( req.getParameter("qId"))) != null) {
				Question question = dao.getById(Integer.parseInt( req.getParameter("qId")));
			    mv.setViewName("showTest");
			    mv.addObject("question", question);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return mv;
	 }
	@RequestMapping("/getAll")
	public ModelAndView getAll(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		List<Question> list = dao.getAll();
		mv.setViewName("getAll");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/getAllByTest")
	public ModelAndView getAllByTest(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		List<Question> list = dao.getByTestId(Integer.parseInt(req.getParameter("testId")));
		mv.setViewName("getAll");
		mv.addObject("list", list);
		return mv;
	}

}
