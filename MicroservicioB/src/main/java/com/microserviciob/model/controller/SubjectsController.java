package com.microserviciob.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microserviciob.model.entity.Subjects;
import com.microserviciob.model.service.SubjectsService;

@RestController
@RequestMapping("/Subjects")

public class SubjectsController {

	//our service is instantiated
	
	@Autowired 
	SubjectsService subjectsService;
	
	@PostMapping("/Save")
	public Subjects Save(@RequestBody Subjects subjects) throws Exception{
		return subjectsService.save(subjects);
	}
	
	@PutMapping("/Update")
	public Subjects Update(@RequestBody Subjects subjects) throws Exception{
		return subjectsService.update(subjects);
	}
	
	@DeleteMapping("/Delete/{id}")
	public void Delete(@PathVariable("id") Integer id) throws Exception {
		subjectsService.delete(id);
	}
	
	@GetMapping("/Get/{id}")
	public Optional<Subjects > Get(@PathVariable("id") Integer id) throws Exception {
		return subjectsService.get(id);
	}
	
	@GetMapping("/Get")
	public List<Subjects > findAll() throws Exception {
		return subjectsService.findAll(null);
		
	}
}
