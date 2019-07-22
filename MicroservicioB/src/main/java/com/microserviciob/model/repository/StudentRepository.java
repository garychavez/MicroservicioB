package com.microserviciob.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciob.model.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
