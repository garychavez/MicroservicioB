package com.microserviciob.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciob.model.entity.Subjects;

public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

}
