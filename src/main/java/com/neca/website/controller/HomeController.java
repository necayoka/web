package com.neca.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neca.website.model.Feedback;
import com.neca.website.repo.Repository;

@Controller
public class HomeController {

	@Autowired
	Repository repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("feedback")
	public String feedback(Feedback feedback) {
		repo.save(feedback);
		return "feedback.jsp";
	}
	
}
