package com.microserviciob.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciob.model.entity.StudentClasses;

public interface StudentClassesRepository extends JpaRepository<StudentClasses, Integer> {

}
