package com.spring.mvc.controller;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mvc.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{

	List<Student> findByName(String name);  
	
	//It provides Query DSL(Domain Specific Language)
	//if we want to create out own method JPaRepository helps it
	//always variable name should start with findBy / getBy
	
	//@Query("from student where name=:name")
	//List<Student> find(String name);
	
	
}
