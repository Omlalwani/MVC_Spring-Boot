package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Student;

@Controller
public class StudentController 
{
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("getStudents")
	public String getStudents(Model m)
	{
		m.addAttribute("student", repo.findAll());
		return "showStudents";
	}
	
	@GetMapping("getStudentByName")
	public String getStudentByName(@RequestParam String name, Model m)
	{
		m.addAttribute("student", repo.findByName(name));
		return "showStudents";
	}
	
	@GetMapping("getStudent")
	public String getStudent(@RequestParam int id, Model m)
	{
		m.addAttribute("result", repo.getOne(id));
		return "showStudents";
	}
	
	
	@PostMapping("addStudent")
	public String addStudent(@ModelAttribute Student s)
	{
		repo.save(s);
		return "showStudents";
	}
}
