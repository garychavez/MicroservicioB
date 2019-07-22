package com.microserviciob.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciob.model.entity.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers, Integer>{

}
