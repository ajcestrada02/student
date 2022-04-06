package com.school.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.demo.model.Student;
import com.school.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public void createStudent(Student student) {
		studentRepository.save(student);
	}

	public Student deleteStudent(Integer studentId) {
		Student stud = studentRepository.findById(studentId).get();
		studentRepository.deleteById(studentId);
		
		return stud;
	}

	
	public List<Student> getStudentByAge(Integer age) {
		return studentRepository.findByAge(age);
	}

}