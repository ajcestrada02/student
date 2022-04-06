package com.school.demo.service;

import java.util.List;

import com.school.demo.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public List<Student> getStudentByAge(Integer age);
	public void createStudent(Student student);
	public Student deleteStudent(Integer studentId);
}
