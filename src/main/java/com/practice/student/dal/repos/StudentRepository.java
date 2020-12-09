package com.practice.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.practice.student.dal.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

   
}
