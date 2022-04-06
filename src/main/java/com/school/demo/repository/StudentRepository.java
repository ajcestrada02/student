package com.school.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
