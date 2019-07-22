package com.microserviciob.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciob.model.entity.Classes;

public interface ClassesRepository extends JpaRepository<Classes, Integer> {

}
