package com.example.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.register.Regparm;
import com.example.register.repo.Regrepo;



@Controller
public class HomeController {

	@Autowired
	Regrepo repo;
	
	@RequestMapping("home")
	public ModelAndView home(Regparm registration) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("obj" ,registration);
		
		mv.setViewName("home");
		
		return mv;
	}
	
	@RequestMapping("/add")
	public String addRegparm(Regparm registration) {
		repo.save(registration);
		return "home";
	}
	
	@RequestMapping("/get")
	public ModelAndView  getRegparm(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("show.jsp");
		Regparm registration = repo.findById(id).orElse(new Regparm());
		mv.addObject(registration);
		return mv;
	}
}


