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

import com.microserviciob.model.entity.School;
import com.microserviciob.model.service.SchoolService;

@RestController
@RequestMapping("/School")

public class SchoolController {

	//our service is instantiated
	
		@Autowired
		SchoolService schoolService;
		
		@PostMapping("/Save")
		public School Save(@RequestBody School school) throws Exception{
			return schoolService.save(school);
		}
		
		@PutMapping("/Update")
		public School Update(@RequestBody School school) throws Exception{
			return schoolService.update(school);
		}
		
		@DeleteMapping("/Delete/{id}")
		public void Delete(@PathVariable("id") Integer id) throws Exception {
			schoolService.delete(id);
		}
		
		@GetMapping("/Get/{id}")
		public Optional<School > Get(@PathVariable("id") Integer id) throws Exception {
			return schoolService.get(id);
		}
		
		@GetMapping("/Get")
		public List< School> findAll() throws Exception {
			return schoolService.findAll(null);
			
		}
}
