package com.microserviciob.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciob.model.entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

}
