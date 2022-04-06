package com.school.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(value = "/getStudent/{age}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getStudentByAge(@PathVariable Integer age) {
		return studentService.getStudentByAge(age);
	}
	
	@PostMapping(value = "/saveStudent", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveStudent(@RequestBody Student student) {
		studentService.createStudent(student);
	}
	
	@DeleteMapping(value = "/deleteStudent/{studentId}")
	public Student deleteStudent(@PathVariable(name = "studentId") Integer studentId) {
		return studentService.deleteStudent(studentId);
	}
}
