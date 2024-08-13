package com.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.model.Student;

@RestController
public class StudentApiController 
{
	@Autowired
	StudentRepo repo;
	
	@GetMapping(path="students", produces = {"application/xml"})
	public List<Student> getStudent() //Is used to get all students
	{
		List<Student> student = repo.findAll();
		return student;
	}
	
	@GetMapping("students/{id}")
	public Student student(@PathVariable("id") int id)
	{
		Student student = repo.findById(id).orElse(new Student());
		return student;
	}
	
	@PostMapping("student")
	public Student addStudents(Student student)
	{
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id)
	{
		repo.deleteById(id);
		return "Student Deleted Succesfully....";
	}
	
}


//In this we are working with API, Postman is used to call the API'S.
//@ResponseBody is used to convert the object to JSON format.
//@PathVariable is used, when we need a particular data from the database.
//Every time we create a method we have to write @ResponseBody, to overcome the issue
//We use @RestController. REST API (Representation State)

//produces is used to specify that in which format we want our data JSON, XML or anything else : it will restrict another format,
//now we will able to fetch only XML format.