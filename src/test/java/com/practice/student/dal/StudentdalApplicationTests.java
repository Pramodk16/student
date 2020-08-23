package com.practice.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.student.dal.entities.Student;
import com.practice.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	@Autowired
	private StudentRepository repository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("Spring");
		student.setFee(30d);
		repository.save(student);
	}

	@Test
	public void testFindStudentId() {
		Student student = repository.findById(1l).get();
		System.out.println(student);
	}

	@Test
	public void testUpdateStudent() {
		Student student = repository.findById(1l).get();
		student.setFee(40d);
		repository.save(student);
		
		      
	}

}
