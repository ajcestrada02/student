package com.school.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.demo.model.Student;
import com.school.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value = "/getAllStudents", produces = MediaType.APPLICATION_JSON_VALUE)
	private List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
}
